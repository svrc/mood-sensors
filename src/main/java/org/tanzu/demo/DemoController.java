package org.tanzu.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.tanzu.demo.config.WebProperties;
import org.tanzu.demo.model.Sensor;
import org.tanzu.demo.model.SensorData;
import org.tanzu.demo.model.SensorRepository;

@CrossOrigin
@RestController
public class DemoController {

    @Autowired
    JdbcTemplate _jdbcTemplate;

    @Autowired
    SensorRepository _sensorRepository;

    @Autowired
    WebProperties _webProperties;

    /*
    @RequestMapping("/")
    public String home(Model model) throws SQLException {
        Connection connection = Objects.requireNonNull(_jdbcTemplate.getDataSource()).getConnection();
        model.addAttribute("sensorDB", "Mood Sensors Data");// Store: " + connection.getMetaData().getURL());
        connection.close();
        return "index";
    }*/

    @RequestMapping("/activate")
    public @ResponseBody
    Map<String, String> write() {
        _sensorRepository.save(new Sensor());
        return new HashMap<String, String>(){{put("sensorStatus","activate");}};
    }
    
    @RequestMapping("/measure")
    public @ResponseBody Iterable<Sensor> sensorsData() {
        return _sensorRepository.findAll();
    }

    @RequestMapping("/refresh")
    public @ResponseBody SensorData refresh() {
        SensorData result = new SensorData( _sensorRepository.findAll(), _webProperties.getTempHeader(),
                _webProperties.getPressureHeader(), _webProperties.getBannerTextColor(), _webProperties.getBannerText());
        return result;
    }
}


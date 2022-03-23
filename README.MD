# DevX mood sensors

An app to demonstrate the use of TAP supply chain with src, test,scan and url

Make sure you have TAP 

## Setup

- install TAP with ```full profile``` and ```ootb_supply_chain_testing_scanning``` included
- Update ```UPDATE_ME``` values in ```supplychain/dekt-path2prod.yaml``` to match the ```registy.server``` and ```registry.repository``` values in your ```tap-values.yaml```
- run ```kapp -y deploy --app rmq-operator --file https://github.com/rabbitmq/cluster-operator/releases/download/v1.9.0/cluster-operator.yml```
- run ```kubectl apply -f supplychain -n YOUR_TAP_DEV_NS```

## deploy the workload

```tanzu apps workload create -f workload.yaml -n YOUR_TAP_DEV_NS```




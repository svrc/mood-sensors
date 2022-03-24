# DevX mood sensors

An app to demonstrate the use of TAP supply chain with src, test,scan and url

Make sure you have TAP 

## Setup

- install TAP with ```full profile``` 
- Update ```UPDATE_ME``` values in ```config/dekt-path2prod.yaml``` to any image repo accessible from this cluster
  - note: if this repo requires authentication and is differenet than the one in the ooot-supplchain, you will need to add a secret as well
- Install the rabbitmq operator 
```
kapp -y deploy --app rmq-operator --file https://github.com/rabbitmq/cluster-operator/releases/download/v1.9.0/cluster-operator.yml
```
- Apply the custom supplychain, policies and rabbit instance
```
kubectl apply -f config/tap -n YOUR_TAP_DEV_NS
```

## Deploy the mood-sensors workload

```
tanzu apps workload create -f workload.yaml -n YOUR_TAP_DEV_NS
```

## Track progess

```
tanzu apps cluster-supply-chain list

tanzu apps workload get mood-sensors -n YOUR_TAP_DEV_NS

kubectl tree workload mood-sensors -n YOUR_TAP_DEV_NS

kubectl describe imagescan.scanning.apps.tanzu.vmware.com/mood-sensors -n YOUR_TAP_DEV_NS

tanzu apps workload tail mood-sensors --since 100m --timestamp  -n YOUR_TAP_DEV_NS

kc get ServiceBinding -n YOUR_TAP_DEV_NS
```

### Register workload entity in TAP GUI
```
https://github.com/dektlong/mood-sensors/blob/main/config/backstage/catalog-info.yaml
```


#use this script if running as a stand alone outside of the DektDevX demo

kapp -y deploy --app rmq-operator --file https://github.com/rabbitmq/cluster-operator/releases/download/v1.9.0/cluster-operator.yml

kubectl apply -f supplychain/templates/rabbitmq-clusterrole.yaml

kubectl apply -f workloads/devx-mood/rabbitmq-instance.yaml -n $DEMO_APPS_NS

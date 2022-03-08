#use this script if running as a stand alone outside of the DektDevX demo

kapp -y deploy --app rmq-operator --file https://github.com/rabbitmq/cluster-operator/releases/download/v1.9.0/cluster-operator.yml

kubectl apply -f rabbitmq-clusterrole.yaml

kubectl apply -f rabbitmq-instance.yaml -n CHANGE_ME

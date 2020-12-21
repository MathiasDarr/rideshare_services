In this directory I experiment w/ Kafka

{"namespace": "org.mddarr.riderequests",
 "type": "record",
 "name": "AvroRideRequest",
 "fields": [
     {"name": "user_id", "type": "string"},
     {"name": "request_time",   "type": "string"},
     {"name": "location_lat",  "type": "double"},
     {"name": "location_lng",  "type": "double"},
     {"name": "destination_lat",  "type": "double"},
     {"name": "destination_lng",  "type": "double"},
     {"name": "status",  "type": "string"},     
     {"name": "riders",  "type": "integer"},
 ]
}
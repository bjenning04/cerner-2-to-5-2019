# cerner_2^5_2019
# Simple Sinatra service to mock service responses
require 'sinatra'
require 'json'

get '/example/service/endpoint' do
    status 200
    content_type :json
    { id: "12345", name: "Jenny", number: "8675309", gotIt: true}.to_json
end
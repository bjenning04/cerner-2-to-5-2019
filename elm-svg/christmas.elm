-- cerner_2^5_2019
-- SVG image creation with Elm
import Svg exposing (..)
import Svg.Attributes exposing (..)

main = svg
    [ width "300", height "300" ]
    [ base "130,250 170,250 170,300 130,300"
    , greenery "50,270 250,270 200,200 100,200"
    , greenery "70,230 230,230 180,150 120,150"
    , greenery "90,180 210,180 150,100"
    , star "150,120 160,90 180,80 160,70 150,50 140,70 120,80 140,90"
    , light "150" "200"
    , light "100" "210"
    , light "200" "210"
    , light "130" "150"
    , light "150" "170"
    , light "170" "150"
    , light "80" "250"
    , light "120" "250"
    , light "180" "250"
    , light "220" "250"
    ]

base : String -> Svg.Svg msg
base myPoints = Svg.polygon [ points <| myPoints, fill "brown", stroke "black" ] []

greenery : String -> Svg.Svg msg
greenery myPoints = Svg.polygon [ points <| myPoints, fill "green", stroke "black" ] []

star : String -> Svg.Svg msg
star myPoints = Svg.polygon [ points <| myPoints, fill "yellow", stroke "black" ] []

light : String -> String -> Svg.Svg msg
light xx yy = Svg.circle [ cx <| xx, cy <| yy, r "6", fill "yellow" ] []
// cerner_2^5_2019

import 'package:flutter/material.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Universal Application',
      home: Scaffold(
        appBar: AppBar(
          title: Text('Universal Application')
        ),
        body: Center(
          child: Text('This is a universal application that can be built to '
              'run on Android, iOS, Windows, MacOS, Linux, and in a web browser.')
        )
      )
    );
  }
}

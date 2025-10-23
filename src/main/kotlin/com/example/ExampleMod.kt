package com.example

import net.fabricmc.api.ClientModInitializer

class ExampleMod : ClientModInitializer{

  override fun onInitializeClient() {
    println("Hello World!")
  }

}

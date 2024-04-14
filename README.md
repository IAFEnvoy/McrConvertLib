# McrConvertLib

MCreator Convert Library

---

## What is this?

This is a library to convert MCreator project into Java project more convenient.

Primary served version: `1.18.2 forge` -> `1.20.1 fabric`

## Maven?
```gradle
maven {
   name = "IAFEnvoy Libs"
   url = 'https://maven.iafenvoy.com/'
}

dependencies {
    modImplementation "com.iafenvoy:mcrconvertlib:${mcrconvertlib_version}"
}
```

## Features?

`ArmorWithTickItem`: Add `onArmorTick(World world, PlayerEntity entity)` method to armors.

`BannerUtil`: Fast way to create banner item stack.

`FoilItemBase`,`FoilSwordItemBase`: Implement `hasGlint()` and always return `true`.

`ItemBase`: Provide item constructor with a setting function.

`MonsterEntityBase`: 1.Implement `getGroup()` and put value into constructor 2.Auto enable AI

`SwordItemBase`: Add `onSwingHand(ItemStack itemtack, World world, double x, double y, double z)` method to swords.

`ToolMaterialBase`: Fast way to create a `ToolMaterial`.

`ComponentUtil`: Spilt text into lines with same render length.

`Consumer5`: Provide a Consumer with 5 params.

`DamageUtil`: Fast way to build `DamageSource` with given `DamageType`

`EntityUtil`: Fast way to spawn an `Entity`

`ParticleUtil`: Fast way to spawn circle and 3x3 particles.

`RandomHelper`: Generate random without Minecraft Random.

`SoundUtil`: Fast way to play and stop sound on both client and server.

`Stage`: (**Temporarily removed**) Provide skin textures depend on Boss/Entity Stage.

`Timeout`: Create timeout tasks.

`EntityRendererBase`: (**Temporarily removed**) Fast way to create renderers with player model. (Better with `StagedEntityTextureProvider` in `Stage`)
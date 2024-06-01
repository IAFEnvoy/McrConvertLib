# McrConvertLib

MCreator Convert Library

---

## What is this?

This is a library to convert MCreator project into Java project more convenient.

Primary served version: `1.18.2 forge` -> `1.20.1 fabric`

## Maven?

If you are not using Gradle Groovy, see: https://maven.iafenvoy.com/#/releases

```gradle
maven {
   name = "IAFEnvoy Libs"
   url = "https://maven.iafenvoy.com/releases"
}

dependencies {
    modImplementation "com.iafenvoy:mcrconvertlib:${mcrconvertlib_version}"
}
```

## Features?

### Item

`ArmorMaterialUtil`: Fast way to create a `ArmorMaterial`.

`ArmorWithTickItem`: Add `onArmorTick(World world, PlayerEntity entity)` method to armors.

`BannerUtil`: Fast way to create banner item stack.

`FoilItemBase`,`FoilSwordItemBase`: Implement `hasGlint()` and always return `true`.

`ItemBase`: Provide item constructor with a setting function.

`MonsterEntityBase`: 1.Implement `getGroup()` and put value into constructor 2.Auto enable AI

`SwordItemBase`: Add `onSwingHand(ItemStack itemtack, World world, double x, double y, double z)` method to swords.

`ToolMaterialUtil`: Fast way to create a `ToolMaterial`.

### Misc

`CommandHelper`: Execute a command on an entity.

`ComponentUtil`: Spilt text into lines with same render length.

`Consumer5`: Provide a Consumer with 5 params.

`RandomHelper`: Generate random without Minecraft Random.

`Timeout`: Create timeout tasks.

#### Render

`EntityRendererBase`: Fast way to create renderers with player model. (Better with `StagedEntityTextureProvider`
in `Stage`)

`SkullRenderRegistry`: Provide ways to register skull renderers.

`Stage`: Provide skin textures depend on Boss/Entity Stage.

#### World

`DamageUtil`: Fast way to build `DamageSource` with given `DamageType`

`EntityUtil`: Fast way to spawn an `Entity`

`ParticleUtil`: Fast way to spawn circle and 3x3 particles.

`SoundUtil`: Fast way to play and stop sound on both client and server.

`VecUtil`: Fast way to create a `BlockPos` and block center pos with 3 `double` location.
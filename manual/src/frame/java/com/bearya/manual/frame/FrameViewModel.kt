package com.bearya.manual.frame

import androidx.fragment.app.Fragment
import androidx.lifecycle.*
import com.bearya.manual.frame.obj.*
import com.bearya.manual.frame.scene.*
import library.ext.setData

class FrameViewModel : ViewModel() {

    val receiveCommand: MutableLiveData<String> by lazy { MutableLiveData<String>() }

    val scene: LiveData<Fragment?> by lazy {
        MediatorLiveData<Fragment?>().apply {
            addSource(storyScene) { setData(it) }
            addSource(cityScene) { setData(it) }
            setData(StateScene.build(ConnectedStateFrame))
        }
    }

    private val commandStory: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    private val commandCity: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    private val cityScene: LiveData<Fragment?> = commandCity.map {
        val commandParams = it.split(";")
        when (commandParams[1]) {
            CityStart -> StartScene.build(CityStartFrame)
            CityTheme -> ThemeScene.build(CityThemeFrame)
            CityWalkMove -> WalkMoveScene.build(WalkMoveFrame)
            CityTLoad -> WalkMoveScene.build(TLoadFrame)
            CityXLoad -> WalkMoveScene.build(XLoadFrame)
            CityStop -> ExceptionScene.build(StopExceptionFrame)
            CityGold -> GoldScene.build(commandParams[2])
            CityRain -> EventScene.build(RainEventFrame)
            CitySpit -> EventScene.build(SpitEventFrame)
            CityBridge -> EventScene.build(BridgeEventFrame)
            CityPickFruit -> EventScene.build(PickFruitEventFrame)
            CityPickToy -> EventScene.build(PickToyEventFrame)
            CityClean -> EventScene.build(CleanEventFrame)
            CityPickBook -> EventScene.build(PickBookEventFrame)
            CityHit -> EventScene.build(HitEventFrame)
            CityMeet -> EventScene.build(MeetEventFrame)
            CitySandwich -> EventScene.build(SandwichEventFrame)
            CityGrass -> EventScene.build(GrassEventFrame)
            CityWater -> EventScene.build(WaterEventFrame)
            CityTree -> EventScene.build(TreeEventFrame)
            CityBattery -> EventScene.build(BatteryEventFrame)
            CityNose -> EventScene.build(NoseEventFrame)
            CityMilk -> EventScene.build(MilkEventFrame)
            CityFlower -> EventScene.build(FlowerEventFrame)
            CityFire -> EventScene.build(FireEventFrame)
            CityGuard -> EventScene.build(GuardEventFrame)
            CityLost -> EventScene.build(LostEventFrame)
            CityShelter -> EventScene.build(ShelterEventFrame)
            CityEscape -> EventScene.build(EscapeEventFrame)
            CityTalk -> EventScene.build(TalkEventFrame)
            CityEarthquake -> EventScene.build(EarthquakeEventFrame)
            CityTrick -> EventScene.build(TrickEventFrame)
            CityWalk -> EventScene.build(WalkEventFrame)
            CityCrossroad -> EventScene.build(CrossroadEventFrame)
            CityPole -> HelpScene.build(PoleHelpFrame)
            CityFirecrackers -> HelpScene.build(FirecrackerHelpFrame)
            CityStomachache -> HelpScene.build(StomachacheHelpFrame)
            CityTrap -> HelpScene.build(TrapHelpFrame)
            CitySlip -> HelpScene.build(SlipHelpFrame)
            CityHome1 -> SummaryScene.build(HomeSummaryFrame1)
            CityHome2 -> SummaryScene.build(HomeSummaryFrame2)
            CityHome3 -> SummaryScene.build(HomeSummaryFrame3)
            CityLibrary1 -> SummaryScene.build(LibrarySummaryFrame1)
            CityLibrary2 -> SummaryScene.build(LibrarySummaryFrame2)
            CityLibrary3 -> SummaryScene.build(LibrarySummaryFrame3)
            CityZoo1 -> SummaryScene.build(ZooSummaryFrame1)
            CityZoo2 -> SummaryScene.build(ZooSummaryFrame2)
            CityZoo3 -> SummaryScene.build(ZooSummaryFrame3)
            CityPark1 -> SummaryScene.build(ParkSummaryFrame1)
            CityPark2 -> SummaryScene.build(ParkSummaryFrame2)
            CityPark3 -> SummaryScene.build(ParkSummaryFrame3)
            CitySchool1 -> SummaryScene.build(SchoolSummaryFrame1)
            CitySchool2 -> SummaryScene.build(SchoolSummaryFrame2)
            CitySchool3 -> SummaryScene.build(SchoolSummaryFrame3)
            CityLoadException1 -> ExceptionScene.build(LoadExceptionFrame1)
            CityLoadException2 -> ExceptionScene.build(LoadExceptionFrame2)
            CityLoadException3 -> ExceptionScene.build(LoadExceptionFrame3)
            CityLoadException4 -> ExceptionScene.build(LoadExceptionFrame4)
            CityLoadException5 -> ExceptionScene.build(LoadExceptionFrame5)
            CityLoadException6 -> ExceptionScene.build(LoadExceptionFrame6)
            CityLoadException7 -> ExceptionScene.build(LoadExceptionFrame7)
            CityFlag -> FlagScene.build(commandParams[2])
            CityKnown -> KnownScene.build(commandParams[2])
            else -> null
        }
    }

    private val storyScene: LiveData<Fragment?> = commandStory.map {
        val commandParams = it.split(";")
        when (commandParams[0]) {
            StoryStart -> StartScene.build(StoryStartFrame)
            StoryTheme -> ThemeScene.build(StoryThemeFrame)
            StoryBall -> IntroduceScene.build(BallIntroduceFrame)
            StoryTreasure -> IntroduceScene.build(TreasureIntroduceFrame)
            StoryHero -> IntroduceScene.build(HeroIntroduceFrame)
            StoryEmotionBall -> EmotionScene.build(BallEmotionFrame)
            StoryEmotionBall1 -> EmotionScene.build(BallEmotionFrame1)
            StoryEmotionBall2 -> EmotionScene.build(BallEmotionFrame2)
            StoryEmotionBall3 -> EmotionScene.build(BallEmotionFrame3)
            StoryEmotionTreasure -> EmotionScene.build(TreasureEmotionFrame)
            StoryEmotionTreasure1 -> EmotionScene.build(TreasureEmotionFrame1)
            StoryEmotionTreasure2 -> EmotionScene.build(TreasureEmotionFrame2)
            StoryEmotionTreasure3 -> EmotionScene.build(TreasureEmotionFrame3)
            StoryEmotionHero -> EmotionScene.build(HeroEmotionFrame)
            StoryEmotionHero1 -> EmotionScene.build(HeroEmotionFrame1)
            StoryEmotionHero2 -> EmotionScene.build(HeroEmotionFrame2)
            StoryEmotionHero3 -> EmotionScene.build(HeroEmotionFrame3)
            StoryArmor -> PropScene.build(ArmorPropFrame)
            StoryCompass -> PropScene.build(CompassPropFrame)
            StoryCrystalShoes -> PropScene.build(CrystalShoesPropFrame)
            StoryDanceSkirt -> PropScene.build(DanceSkirtPropFrame)
            StoryFatTonny -> PropScene.build(FatTonnyPropFrame)
            StoryKey -> PropScene.build(KeyPropFrame)
            StoryPegasus -> PropScene.build(PegasusPropFrame)
            StorySword -> PropScene.build(SwordPropFrame)
            StoryTreasureMap -> PropScene.build(TreasureMapPropFrame)
            StoryVolcanic -> ObstacleScene.build(VolcanicObstacleFrame)
            StoryBigMonsterSuccess -> ObstacleScene.build(BigMonsterSuccessObstacleFrame)
            StoryBigMonsterFail -> ObstacleScene.build(BigMonsterFailObstacleFrame)
            StoryCannibalFlowerSuccess -> ObstacleScene.build(FlowerSuccessObstacleFrame)
            StoryCannibalFlowerFail -> ObstacleScene.build(FlowerFailObstacleFrame)
            StoryCrocodileLakeSuccess -> ObstacleScene.build(CrocodileSuccessObstacleFrame)
            StoryCrocodileLakeFail -> ObstacleScene.build(CrocodileFailObstacleFrame)
            StoryNineTailedCatSuccess -> ObstacleScene.build(CatSuccessObstacleFrame)
            StoryNineTailedCatFail -> ObstacleScene.build(CatFailObstacleFrame)
            StorySpiderSuccess -> ObstacleScene.build(SpiderSuccessObstacleFrame)
            StorySpiderFail -> ObstacleScene.build(SpiderFailObstacleFrame)
            StoryTreeDemonSuccess -> ObstacleScene.build(TreeSuccessObstacleFrame)
            StoryTreeDemonFail -> ObstacleScene.build(TreeFailObstacleFrame)
            StoryWitchSuccess -> ObstacleScene.build(WitchSuccessObstacleFrame)
            StoryWitchFail -> ObstacleScene.build(WitchFailObstacleFrame)
            StoryZombieSuccess -> ObstacleScene.build(ZombieSuccessObstacleFrame)
            StoryZombieFail -> ObstacleScene.build(ZombieFailObstacleFrame)
            StoryEndBall -> EndScene.build(BallEndFrame)
            StoryEndSeafloor -> EndScene.build(SeafloorEndFrame)
            StoryEndSpirit -> EndScene.build(SpiritEndFrame)
            StoryEndUniverse -> EndScene.build(UniverseEndFrame)
            StoryEndHero -> EndScene.build(HeroEndFrame)
            StoryEditCard -> StateScene.build(EditCardStateFrame)
            StoryBallFail1 -> EndFailScene.build(BallEndFailFrame1)
            StoryBallFail2 -> EndFailScene.build(BallEndFailFrame2)
            StoryBallFail3 -> EndFailScene.build(BallEndFailFrame3)
            StoryBallFail4 -> EndFailScene.build(BallEndFailFrame4)
            StoryBallFail5 -> EndFailScene.build(BallEndFailFrame5)
            StoryBallFail6 -> EndFailScene.build(BallEndFailFrame6)
            StoryBallFail7 -> EndFailScene.build(BallEndFailFrame7)
            StoryHeroFail1 -> EndFailScene.build(HeroEndFailFrame1)
            StoryHeroFail2 -> EndFailScene.build(HeroEndFailFrame2)
            StoryHeroFail3 -> EndFailScene.build(HeroEndFailFrame3)
            StoryHeroFail4 -> EndFailScene.build(HeroEndFailFrame4)
            StoryHeroFail5 -> EndFailScene.build(HeroEndFailFrame5)
            StoryHeroFail6 -> EndFailScene.build(HeroEndFailFrame6)
            StoryHeroFail7 -> EndFailScene.build(HeroEndFailFrame7)
            StorySeafloorFail1 -> EndFailScene.build(SeafloorEndFailFrame1)
            StorySeafloorFail2 -> EndFailScene.build(SeafloorEndFailFrame2)
            StorySeafloorFail3 -> EndFailScene.build(SeafloorEndFailFrame3)
            StorySeafloorFail4 -> EndFailScene.build(SeafloorEndFailFrame4)
            StorySeafloorFail5 -> EndFailScene.build(SeafloorEndFailFrame5)
            StorySeafloorFail6 -> EndFailScene.build(SeafloorEndFailFrame6)
            StorySeafloorFail7 -> EndFailScene.build(SeafloorEndFailFrame7)
            StorySpiritFail1 -> EndFailScene.build(SpiritEndFailFrame1)
            StorySpiritFail2 -> EndFailScene.build(SpiritEndFailFrame2)
            StorySpiritFail3 -> EndFailScene.build(SpiritEndFailFrame3)
            StorySpiritFail4 -> EndFailScene.build(SpiritEndFailFrame4)
            StorySpiritFail5 -> EndFailScene.build(SpiritEndFailFrame5)
            StorySpiritFail6 -> EndFailScene.build(SpiritEndFailFrame6)
            StorySpiritFail7 -> EndFailScene.build(SpiritEndFailFrame7)
            StoryTreasureFail1 -> EndFailScene.build(UniverseEndFailFrame1)
            StoryTreasureFail2 -> EndFailScene.build(UniverseEndFailFrame2)
            StoryTreasureFail3 -> EndFailScene.build(UniverseEndFailFrame3)
            StoryTreasureFail4 -> EndFailScene.build(UniverseEndFailFrame4)
            StoryTreasureFail5 -> EndFailScene.build(UniverseEndFailFrame5)
            StoryTreasureFail6 -> EndFailScene.build(UniverseEndFailFrame6)
            StoryTreasureFail7 -> EndFailScene.build(UniverseEndFailFrame7)
            StoryWarning1 -> StoryErrorScene.build(Warning1ErrorTextFrame)
            StoryWarning2 -> StoryErrorScene.build(Warning2ErrorTextFrame)
            StoryWarning3 -> StoryErrorScene.build(Warning3ErrorTextFrame)
            StoryWarning4 -> StoryErrorScene.build(Warning4ErrorTextFrame)
            StoryWarning5 -> StoryErrorScene.build(Warning5ErrorTextFrame)
            StoryWarning6 -> StoryErrorScene.build(Warning6ErrorTextFrame)
            StoryWarning7 -> StoryErrorScene.build(Warning7ErrorTextFrame)
            StoryWarning8 -> StoryErrorScene.build(Warning8ErrorTextFrame)
            StoryWarning9 -> StoryErrorScene.build(Warning9ErrorTextFrame)
            else -> null
        }
    }

    fun receive(command: String?) {
        command?.apply { receiveCommand.setData(this) }
        when {
            // 跳跳镇命令
            command?.takeIf { it.startsWith("city;") }?.let { true } ?: false -> commandCity.setData(command)
            // 童话世界命令
            command?.takeIf { it.startsWith("8") }?.let { true } ?: false -> commandStory.setData(command)
        }
    }

}
package com.cj.crstats.model.dataobj

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PlayerDataObj(

    @SerializedName("tag")
    @Expose
    val tag: String,

    @SerializedName("name")
    @Expose
    val name: String,

    @SerializedName("expLevel")
    @Expose
    val expLevel: Int,

    @SerializedName("trophies")
    @Expose
    val trophies: Int,

    @SerializedName("bestTrophies")
    @Expose
    val bestTrophies: Int,

    @SerializedName("wins")
    @Expose
    val wins: Int,

    @SerializedName("losses")
    @Expose
    val losses: Int,

    @SerializedName("battleCount")
    @Expose
    val battleCount: Int,

    @SerializedName("threeCrownWins")
    @Expose
    val threeCrownWins: Int,

    @SerializedName("challengeCardsWon")
    @Expose
    val challengeCardsWon: Int,

    @SerializedName("challengeMaxWins")
    @Expose
    val challengeMaxWins: Int,

    @SerializedName("tournamentCardsWon")
    @Expose
    val tournamentCardsWon: Int,

    @SerializedName("tournamentBattleCount")
    @Expose
    val tournamentBattleCount: Int,

    @SerializedName("role")
    @Expose
    val role: String,

    @SerializedName("donations")
    @Expose
    val donations: Int,

    @SerializedName("donationsReceived")
    @Expose
    val donationsReceived: Int,

    @SerializedName("totalDonations")
    @Expose
    val totalDonations: Int,

    @SerializedName("warDayWins")
    @Expose
    val warDayWins: Int,

    @SerializedName("clanCardsCollected")
    @Expose
    val clanCardsCollected: Int,

    @SerializedName("clan")
    @Expose
    val clan: ClanDataObj,

    @SerializedName("arena")
    @Expose
    val arena: ArenaDataObj,

    @SerializedName("badges")
    @Expose
    val badges: List<BadgeDataObj>,

    @SerializedName("achievements")
    @Expose
    val achievements: List<AchievementDataObj>,

    @SerializedName("cards")
    @Expose
    val cards: List<CardDataObj>,

    @SerializedName("supportCards")
    @Expose
    val supportCards: List<SupportCardDataObj>,

    @SerializedName("currentDeck")
    @Expose
    val currentDeck: List<CardDataObj>
)

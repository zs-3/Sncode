package org.fortheloss.sticknodes.minigamescreen;

/* loaded from: classes2.dex */
public class MiniGameSoundHandler implements com.badlogic.gdx.utils.Disposable {
    private int _musicFadeState;
    private boolean _musicOn;
    private com.badlogic.gdx.audio.Music _musicToFadeOutRef;
    private com.badlogic.gdx.audio.Music _musicToPlayRef;
    private float _musicToPlayVolume;
    private boolean _soundOn;
    public com.badlogic.gdx.audio.Music musGameplay;
    public com.badlogic.gdx.audio.Music musMenu;
    public com.badlogic.gdx.audio.Sound sndButtonNo;
    public com.badlogic.gdx.audio.Sound sndButtonYes;
    public com.badlogic.gdx.audio.Sound sndCutSceneSeanHit;
    public com.badlogic.gdx.audio.Sound sndCutsceneSeanHover;
    public com.badlogic.gdx.audio.Sound sndCutsceneSeanRelease;
    public com.badlogic.gdx.audio.Sound sndCutsceneSeanWiggle;
    public com.badlogic.gdx.audio.Sound sndDeathExplosion;
    public com.badlogic.gdx.audio.Sound sndDeathSplat;
    public com.badlogic.gdx.audio.Sound sndFootstep1;
    public com.badlogic.gdx.audio.Sound sndFootstep2;
    public com.badlogic.gdx.audio.Sound sndFootstep3;
    public com.badlogic.gdx.audio.Sound sndFootstep4;
    public com.badlogic.gdx.audio.Sound sndFootstep5;
    public com.badlogic.gdx.audio.Sound sndFootstep6;
    public com.badlogic.gdx.audio.Sound sndJump;
    public com.badlogic.gdx.audio.Sound sndJumpLand;
    public com.badlogic.gdx.audio.Sound sndOnDeath;
    public com.badlogic.gdx.audio.Sound sndPunch1;
    public com.badlogic.gdx.audio.Sound sndPunch2;
    public com.badlogic.gdx.audio.Sound sndPunch3;
    public com.badlogic.gdx.audio.Sound sndPunchSwing;
    public com.badlogic.gdx.audio.Sound sndSeanThrow1;
    public com.badlogic.gdx.audio.Sound sndSeanThrow2;
    public com.badlogic.gdx.audio.Sound sndSeanThrow3;
    public com.badlogic.gdx.audio.Sound sndSlide;
    public com.badlogic.gdx.audio.Sound sndStack1;
    public com.badlogic.gdx.audio.Sound sndStack2;
    public com.badlogic.gdx.audio.Sound sndStack3;

    public MiniGameSoundHandler() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1._soundOn = r0
            r1._musicOn = r0
            r0 = 0
            r1._musicFadeState = r0
            r0 = 0
            r1._musicToPlayVolume = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            com.badlogic.gdx.audio.Music r0 = r1.musGameplay
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto Ld
            com.badlogic.gdx.audio.Music r0 = r1.musGameplay
            r0.stop()
        Ld:
            com.badlogic.gdx.audio.Music r0 = r1.musMenu
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L1a
            com.badlogic.gdx.audio.Music r0 = r1.musMenu
            r0.stop()
        L1a:
            r0 = 0
            r1.sndButtonNo = r0
            r1.sndButtonYes = r0
            r1.sndCutSceneSeanHit = r0
            r1.sndCutsceneSeanHover = r0
            r1.sndCutsceneSeanRelease = r0
            r1.sndCutsceneSeanWiggle = r0
            r1.sndDeathExplosion = r0
            r1.sndDeathSplat = r0
            r1.sndFootstep1 = r0
            r1.sndFootstep2 = r0
            r1.sndFootstep3 = r0
            r1.sndFootstep4 = r0
            r1.sndFootstep5 = r0
            r1.sndFootstep6 = r0
            r1.sndJump = r0
            r1.sndJumpLand = r0
            r1.sndOnDeath = r0
            r1.sndPunch1 = r0
            r1.sndPunch2 = r0
            r1.sndPunch3 = r0
            r1.sndPunchSwing = r0
            r1.sndSeanThrow1 = r0
            r1.sndSeanThrow2 = r0
            r1.sndSeanThrow3 = r0
            r1.sndSlide = r0
            r1.sndStack1 = r0
            r1.sndStack2 = r0
            r1.sndStack3 = r0
            r1.musMenu = r0
            r1.musGameplay = r0
            r1._musicToFadeOutRef = r0
            return
    }

    public void getSoundsFromAssets(org.fortheloss.framework.Assets r6) {
            r5 = this;
            java.lang.Class<com.badlogic.gdx.audio.Music> r0 = com.badlogic.gdx.audio.Music.class
            java.lang.Class<com.badlogic.gdx.audio.Sound> r1 = com.badlogic.gdx.audio.Sound.class
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "buttonNo.mp3"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndButtonNo = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "buttonYes.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndButtonYes = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "cutsceneSeanHit.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndCutSceneSeanHit = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "cutsceneSeanHover.wav"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndCutsceneSeanHover = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "cutsceneSeanRelease.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndCutsceneSeanRelease = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "cutsceneSeanWiggle.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndCutsceneSeanWiggle = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "deathExplosion.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndDeathExplosion = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "deathSplat.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndDeathSplat = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep1.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndFootstep1 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep2.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndFootstep2 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep3.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndFootstep3 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep4.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndFootstep4 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep5.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndFootstep5 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "footstep6.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndFootstep6 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "jump.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndJump = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "jumpLand.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndJumpLand = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "onDeath.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndOnDeath = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "punch1.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndPunch1 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "punch2.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndPunch2 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "punch3.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndPunch3 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "punchSwing.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndPunchSwing = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "seanThrow1.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndSeanThrow1 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "seanThrow2.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndSeanThrow2 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "seanThrow3.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndSeanThrow3 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "slide.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndSlide = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "stack1.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndStack1 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "stack2.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r2 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r2 = (com.badlogic.gdx.audio.Sound) r2
            r5.sndStack2 = r2
            java.lang.String r2 = org.fortheloss.sticknodes.App.minigameSoundsDirectory
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "stack3.mp3"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r1 = r6.get(r2, r1, r3)
            com.badlogic.gdx.audio.Sound r1 = (com.badlogic.gdx.audio.Sound) r1
            r5.sndStack3 = r1
            com.badlogic.gdx.Application r1 = com.badlogic.gdx.Gdx.app
            com.badlogic.gdx.Application$ApplicationType r1 = r1.getType()
            com.badlogic.gdx.Application$ApplicationType r2 = com.badlogic.gdx.Application.ApplicationType.iOS
            if (r1 != r2) goto L33a
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "musMenu.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object r1 = r6.get(r1, r0, r3)
            com.badlogic.gdx.audio.Music r1 = (com.badlogic.gdx.audio.Music) r1
            r5.musMenu = r1
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "musGameplay.mp3"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object r6 = r6.get(r1, r0, r3)
            com.badlogic.gdx.audio.Music r6 = (com.badlogic.gdx.audio.Music) r6
            r5.musGameplay = r6
            goto L370
        L33a:
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "musMenu.ogg"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object r1 = r6.get(r1, r0, r3)
            com.badlogic.gdx.audio.Music r1 = (com.badlogic.gdx.audio.Music) r1
            r5.musMenu = r1
            java.lang.String r1 = org.fortheloss.sticknodes.App.minigameMusicDirectory
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "musGameplay.ogg"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object r6 = r6.get(r1, r0, r3)
            com.badlogic.gdx.audio.Music r6 = (com.badlogic.gdx.audio.Music) r6
            r5.musGameplay = r6
        L370:
            return
    }

    public boolean isMusicOn() {
            r1 = this;
            boolean r0 = r1._musicOn
            return r0
    }

    public boolean isSoundOn() {
            r1 = this;
            boolean r0 = r1._soundOn
            return r0
    }

    public long loopSound(com.badlogic.gdx.audio.Sound r2, float r3) {
            r1 = this;
            boolean r0 = r1._soundOn
            if (r0 != 0) goto L7
            r2 = -1
            return r2
        L7:
            long r2 = r2.loop(r3)
            return r2
    }

    public void playMusic(com.badlogic.gdx.audio.Music r3, float r4) {
            r2 = this;
            r2._musicToPlayVolume = r4
            com.badlogic.gdx.audio.Music r0 = r2.musGameplay
            boolean r0 = r0.isPlaying()
            r1 = 1
            if (r0 == 0) goto L14
            com.badlogic.gdx.audio.Music r4 = r2.musGameplay
            r2._musicToFadeOutRef = r4
            r2._musicToPlayRef = r3
            r2._musicFadeState = r1
            goto L30
        L14:
            com.badlogic.gdx.audio.Music r0 = r2.musMenu
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L27
            com.badlogic.gdx.audio.Music r0 = r2.musMenu
            r2._musicToFadeOutRef = r0
            r2._musicToPlayRef = r3
            r2._musicToPlayVolume = r4
            r2._musicFadeState = r1
            goto L30
        L27:
            r3.setLooping(r1)
            r3.setVolume(r4)
            r3.play()
        L30:
            return
    }

    public void playSound(com.badlogic.gdx.audio.Sound r2, float r3) {
            r1 = this;
            boolean r0 = r1._soundOn
            if (r0 != 0) goto L5
            return
        L5:
            r2.play(r3)
            return
    }

    public void setMusicOn(boolean r2) {
            r1 = this;
            r1._musicOn = r2
            if (r2 == 0) goto L23
            com.badlogic.gdx.audio.Music r2 = r1.musGameplay
            boolean r2 = r2.isPlaying()
            if (r2 == 0) goto L14
            com.badlogic.gdx.audio.Music r2 = r1.musGameplay
            float r0 = r1._musicToPlayVolume
            r2.setVolume(r0)
            goto L23
        L14:
            com.badlogic.gdx.audio.Music r2 = r1.musMenu
            boolean r2 = r2.isPlaying()
            if (r2 == 0) goto L23
            com.badlogic.gdx.audio.Music r2 = r1.musMenu
            float r0 = r1._musicToPlayVolume
            r2.setVolume(r0)
        L23:
            return
    }

    public void setMusicVolume(float r2) {
            r1 = this;
            com.badlogic.gdx.audio.Music r0 = r1.musGameplay
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto Le
            com.badlogic.gdx.audio.Music r0 = r1.musGameplay
            r0.setVolume(r2)
            goto L1b
        Le:
            com.badlogic.gdx.audio.Music r0 = r1.musMenu
            boolean r0 = r0.isPlaying()
            if (r0 == 0) goto L1b
            com.badlogic.gdx.audio.Music r0 = r1.musMenu
            r0.setVolume(r2)
        L1b:
            return
    }

    public void setSoundOn(boolean r1) {
            r0 = this;
            r0._soundOn = r1
            return
    }

    public void stopSound(com.badlogic.gdx.audio.Sound r1) {
            r0 = this;
            r1.stop()
            return
    }

    public void updateMusicFade(float r5) {
            r4 = this;
            int r0 = r4._musicFadeState
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L2f
            com.badlogic.gdx.audio.Music r0 = r4._musicToFadeOutRef
            float r0 = r0.getVolume()
            float r0 = r0 - r5
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L29
            com.badlogic.gdx.audio.Music r5 = r4._musicToFadeOutRef
            r5.stop()
            com.badlogic.gdx.audio.Music r5 = r4._musicToPlayRef
            r5.setVolume(r3)
            com.badlogic.gdx.audio.Music r5 = r4._musicToPlayRef
            r5.setLooping(r2)
            com.badlogic.gdx.audio.Music r5 = r4._musicToPlayRef
            r5.play()
            r4._musicFadeState = r1
            goto L4c
        L29:
            com.badlogic.gdx.audio.Music r5 = r4._musicToFadeOutRef
            r5.setVolume(r0)
            goto L4c
        L2f:
            if (r0 != r1) goto L4c
            com.badlogic.gdx.audio.Music r0 = r4._musicToPlayRef
            float r0 = r0.getVolume()
            float r0 = r0 + r5
            float r5 = r4._musicToPlayVolume
            int r1 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r1 < 0) goto L47
            com.badlogic.gdx.audio.Music r0 = r4._musicToPlayRef
            r0.setVolume(r5)
            r5 = 0
            r4._musicFadeState = r5
            goto L4c
        L47:
            com.badlogic.gdx.audio.Music r5 = r4._musicToPlayRef
            r5.setVolume(r0)
        L4c:
            boolean r5 = r4._musicOn
            if (r5 != 0) goto L5a
            com.badlogic.gdx.audio.Music r5 = r4.musMenu
            r5.setVolume(r3)
            com.badlogic.gdx.audio.Music r5 = r4.musGameplay
            r5.setVolume(r3)
        L5a:
            return
    }
}

package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
final class AndroidSound implements com.badlogic.gdx.audio.Sound {
    final android.media.AudioManager manager;
    final int soundId;
    final android.media.SoundPool soundPool;
    final com.badlogic.gdx.utils.IntArray streamIds;

    AndroidSound(android.media.SoundPool r3, android.media.AudioManager r4, int r5) {
            r2 = this;
            r2.<init>()
            com.badlogic.gdx.utils.IntArray r0 = new com.badlogic.gdx.utils.IntArray
            r1 = 8
            r0.<init>(r1)
            r2.streamIds = r0
            r2.soundPool = r3
            r2.manager = r4
            r2.soundId = r5
            return
    }

    @Override // com.badlogic.gdx.audio.Sound, com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            android.media.SoundPool r0 = r2.soundPool
            int r1 = r2.soundId
            r0.unload(r1)
            return
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop() {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            long r0 = r2.loop(r0)
            return r0
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop(float r11) {
            r10 = this;
            com.badlogic.gdx.utils.IntArray r0 = r10.streamIds
            int r1 = r0.size
            r2 = 8
            if (r1 != r2) goto Lb
            r0.pop()
        Lb:
            android.media.SoundPool r3 = r10.soundPool
            int r4 = r10.soundId
            r7 = 2
            r8 = -1
            r9 = 1065353216(0x3f800000, float:1.0)
            r5 = r11
            r6 = r11
            int r11 = r3.play(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L1e
            r0 = -1
            return r0
        L1e:
            com.badlogic.gdx.utils.IntArray r0 = r10.streamIds
            r1 = 0
            r0.insert(r1, r11)
            long r0 = (long) r11
            return r0
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long loop(float r9, float r10, float r11) {
            r8 = this;
            com.badlogic.gdx.utils.IntArray r0 = r8.streamIds
            int r1 = r0.size
            r2 = 8
            if (r1 != r2) goto Lb
            r0.pop()
        Lb:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r2 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r2 >= 0) goto L1c
            float r11 = java.lang.Math.abs(r11)
            float r0 = r0 - r11
            float r0 = r0 * r9
            r3 = r9
            r4 = r0
            goto L2c
        L1c:
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2a
            float r11 = java.lang.Math.abs(r11)
            float r0 = r0 - r11
            float r0 = r0 * r9
            r4 = r9
            r3 = r0
            goto L2c
        L2a:
            r3 = r9
            r4 = r3
        L2c:
            android.media.SoundPool r1 = r8.soundPool
            int r2 = r8.soundId
            r5 = 2
            r6 = -1
            r7 = r10
            int r9 = r1.play(r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L3c
            r9 = -1
            return r9
        L3c:
            com.badlogic.gdx.utils.IntArray r10 = r8.streamIds
            r11 = 0
            r10.insert(r11, r9)
            long r9 = (long) r9
            return r9
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void pause() {
            r1 = this;
            android.media.SoundPool r0 = r1.soundPool
            r0.autoPause()
            return
    }

    public void pause(long r2) {
            r1 = this;
            android.media.SoundPool r0 = r1.soundPool
            int r3 = (int) r2
            r0.pause(r3)
            return
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play() {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            long r0 = r2.play(r0)
            return r0
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play(float r11) {
            r10 = this;
            com.badlogic.gdx.utils.IntArray r0 = r10.streamIds
            int r1 = r0.size
            r2 = 8
            if (r1 != r2) goto Lb
            r0.pop()
        Lb:
            android.media.SoundPool r3 = r10.soundPool
            int r4 = r10.soundId
            r7 = 1
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r5 = r11
            r6 = r11
            int r11 = r3.play(r4, r5, r6, r7, r8, r9)
            if (r11 != 0) goto L1e
            r0 = -1
            return r0
        L1e:
            com.badlogic.gdx.utils.IntArray r0 = r10.streamIds
            r1 = 0
            r0.insert(r1, r11)
            long r0 = (long) r11
            return r0
    }

    @Override // com.badlogic.gdx.audio.Sound
    public long play(float r9, float r10, float r11) {
            r8 = this;
            com.badlogic.gdx.utils.IntArray r0 = r8.streamIds
            int r1 = r0.size
            r2 = 8
            if (r1 != r2) goto Lb
            r0.pop()
        Lb:
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r2 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r2 >= 0) goto L1c
            float r11 = java.lang.Math.abs(r11)
            float r0 = r0 - r11
            float r0 = r0 * r9
            r3 = r9
            r4 = r0
            goto L2c
        L1c:
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L2a
            float r11 = java.lang.Math.abs(r11)
            float r0 = r0 - r11
            float r0 = r0 * r9
            r4 = r9
            r3 = r0
            goto L2c
        L2a:
            r3 = r9
            r4 = r3
        L2c:
            android.media.SoundPool r1 = r8.soundPool
            int r2 = r8.soundId
            r5 = 1
            r6 = 0
            r7 = r10
            int r9 = r1.play(r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L3c
            r9 = -1
            return r9
        L3c:
            com.badlogic.gdx.utils.IntArray r10 = r8.streamIds
            r11 = 0
            r10.insert(r11, r9)
            long r9 = (long) r9
            return r9
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void resume() {
            r1 = this;
            android.media.SoundPool r0 = r1.soundPool
            r0.autoResume()
            return
    }

    public void resume(long r2) {
            r1 = this;
            android.media.SoundPool r0 = r1.soundPool
            int r3 = (int) r2
            r0.resume(r3)
            return
    }

    public void setLooping(long r2, boolean r4) {
            r1 = this;
            int r3 = (int) r2
            android.media.SoundPool r2 = r1.soundPool
            r2.pause(r3)
            android.media.SoundPool r2 = r1.soundPool
            if (r4 == 0) goto Lc
            r0 = -1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r2.setLoop(r3, r0)
            if (r4 == 0) goto L19
            android.media.SoundPool r2 = r1.soundPool
            r4 = 2
            r2.setPriority(r3, r4)
            goto L1f
        L19:
            android.media.SoundPool r2 = r1.soundPool
            r4 = 1
            r2.setPriority(r3, r4)
        L1f:
            android.media.SoundPool r2 = r1.soundPool
            r2.resume(r3)
            return
    }

    public void setPan(long r5, float r7, float r8) {
            r4 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r2 >= 0) goto Lf
            float r7 = java.lang.Math.abs(r7)
            float r0 = r0 - r7
            float r0 = r0 * r8
            goto L1f
        Lf:
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1e
            float r7 = java.lang.Math.abs(r7)
            float r0 = r0 - r7
            float r0 = r0 * r8
            r3 = r0
            r0 = r8
            r8 = r3
            goto L1f
        L1e:
            r0 = r8
        L1f:
            android.media.SoundPool r7 = r4.soundPool
            int r6 = (int) r5
            r7.setVolume(r6, r8, r0)
            return
    }

    public void setPitch(long r2, float r4) {
            r1 = this;
            android.media.SoundPool r0 = r1.soundPool
            int r3 = (int) r2
            r0.setRate(r3, r4)
            return
    }

    public void setVolume(long r2, float r4) {
            r1 = this;
            android.media.SoundPool r0 = r1.soundPool
            int r3 = (int) r2
            r0.setVolume(r3, r4, r4)
            return
    }

    @Override // com.badlogic.gdx.audio.Sound
    public void stop() {
            r4 = this;
            com.badlogic.gdx.utils.IntArray r0 = r4.streamIds
            int r0 = r0.size
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            android.media.SoundPool r2 = r4.soundPool
            com.badlogic.gdx.utils.IntArray r3 = r4.streamIds
            int r3 = r3.get(r1)
            r2.stop(r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    public void stop(long r2) {
            r1 = this;
            android.media.SoundPool r0 = r1.soundPool
            int r3 = (int) r2
            r0.stop(r3)
            return
    }
}

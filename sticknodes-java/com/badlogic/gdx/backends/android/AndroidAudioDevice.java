package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
class AndroidAudioDevice implements com.badlogic.gdx.audio.AudioDevice {
    private short[] buffer;
    private final boolean isMono;
    private final int latency;
    private final android.media.AudioTrack track;

    AndroidAudioDevice(int r13, boolean r14) {
            r12 = this;
            r12.<init>()
            r0 = 1024(0x400, float:1.435E-42)
            short[] r0 = new short[r0]
            r12.buffer = r0
            r12.isMono = r14
            r0 = 4
            r1 = 12
            if (r14 == 0) goto L12
            r2 = 4
            goto L14
        L12:
            r2 = 12
        L14:
            r3 = 2
            int r2 = android.media.AudioTrack.getMinBufferSize(r13, r2, r3)
            android.media.AudioTrack r11 = new android.media.AudioTrack
            r5 = 3
            if (r14 == 0) goto L20
            r7 = 4
            goto L22
        L20:
            r7 = 12
        L22:
            r8 = 2
            r10 = 1
            r4 = r11
            r6 = r13
            r9 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12.track = r11
            r11.play()
            if (r14 == 0) goto L32
            r3 = 1
        L32:
            int r2 = r2 / r3
            r12.latency = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            android.media.AudioTrack r0 = r1.track
            r0.stop()
            android.media.AudioTrack r0 = r1.track
            r0.release()
            return
    }

    public int getLatency() {
            r1 = this;
            int r0 = r1.latency
            return r0
    }

    public boolean isMono() {
            r1 = this;
            boolean r0 = r1.isMono
            return r0
    }

    public void pause() {
            r2 = this;
            android.media.AudioTrack r0 = r2.track
            int r0 = r0.getPlayState()
            r1 = 3
            if (r0 != r1) goto Le
            android.media.AudioTrack r0 = r2.track
            r0.pause()
        Le:
            return
    }

    public void resume() {
            r2 = this;
            android.media.AudioTrack r0 = r2.track
            int r0 = r0.getPlayState()
            r1 = 2
            if (r0 != r1) goto Le
            android.media.AudioTrack r0 = r2.track
            r0.play()
        Le:
            return
    }

    public void setVolume(float r2) {
            r1 = this;
            android.media.AudioTrack r0 = r1.track
            r0.setStereoVolume(r2, r2)
            return
    }

    public void writeSamples(float[] r7, int r8, int r9) {
            r6 = this;
            short[] r0 = r6.buffer
            int r0 = r0.length
            int r1 = r7.length
            if (r0 >= r1) goto Lb
            int r0 = r7.length
            short[] r0 = new short[r0]
            r6.buffer = r0
        Lb:
            int r0 = r8 + r9
            r1 = 0
            r2 = 0
        Lf:
            if (r8 >= r0) goto L33
            r3 = r7[r8]
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L1b
            r3 = 1065353216(0x3f800000, float:1.0)
        L1b:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L23
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L23:
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            short[] r4 = r6.buffer
            r4[r2] = r3
            int r8 = r8 + 1
            int r2 = r2 + 1
            goto Lf
        L33:
            android.media.AudioTrack r7 = r6.track
            short[] r8 = r6.buffer
            int r7 = r7.write(r8, r1, r9)
        L3b:
            if (r7 == r9) goto L49
            android.media.AudioTrack r8 = r6.track
            short[] r0 = r6.buffer
            int r1 = r9 - r7
            int r8 = r8.write(r0, r7, r1)
            int r7 = r7 + r8
            goto L3b
        L49:
            return
    }

    public void writeSamples(short[] r5, int r6, int r7) {
            r4 = this;
            android.media.AudioTrack r0 = r4.track
            int r0 = r0.write(r5, r6, r7)
        L6:
            if (r0 == r7) goto L14
            android.media.AudioTrack r1 = r4.track
            int r2 = r6 + r0
            int r3 = r7 - r0
            int r1 = r1.write(r5, r2, r3)
            int r0 = r0 + r1
            goto L6
        L14:
            return
    }
}

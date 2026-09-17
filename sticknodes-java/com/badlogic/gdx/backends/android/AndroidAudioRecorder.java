package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public class AndroidAudioRecorder implements com.badlogic.gdx.audio.AudioRecorder {
    private android.media.AudioRecord recorder;

    @android.annotation.SuppressLint({"MissingPermission"})
    public AndroidAudioRecorder(int r7, boolean r8) {
            r6 = this;
            r6.<init>()
            if (r8 == 0) goto La
            r8 = 16
            r3 = 16
            goto Le
        La:
            r8 = 12
            r3 = 12
        Le:
            r8 = 2
            int r5 = android.media.AudioRecord.getMinBufferSize(r7, r3, r8)
            android.media.AudioRecord r8 = new android.media.AudioRecord
            r1 = 1
            r4 = 2
            r0 = r8
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.recorder = r8
            int r7 = r8.getState()
            r8 = 1
            if (r7 != r8) goto L2b
            android.media.AudioRecord r7 = r6.recorder
            r7.startRecording()
            return
        L2b:
            com.badlogic.gdx.utils.GdxRuntimeException r7 = new com.badlogic.gdx.utils.GdxRuntimeException
            java.lang.String r8 = "Unable to initialize AudioRecorder.\nDo you have the RECORD_AUDIO permission?"
            r7.<init>(r8)
            throw r7
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r1 = this;
            android.media.AudioRecord r0 = r1.recorder
            r0.stop()
            android.media.AudioRecord r0 = r1.recorder
            r0.release()
            return
    }

    public void read(short[] r5, int r6, int r7) {
            r4 = this;
            r0 = 0
        L1:
            if (r0 == r7) goto Lf
            android.media.AudioRecord r1 = r4.recorder
            int r2 = r6 + r0
            int r3 = r7 - r0
            int r1 = r1.read(r5, r2, r3)
            int r0 = r0 + r1
            goto L1
        Lf:
            return
    }
}

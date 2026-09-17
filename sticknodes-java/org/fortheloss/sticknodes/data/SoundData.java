package org.fortheloss.sticknodes.data;

/* loaded from: classes2.dex */
public class SoundData implements com.badlogic.gdx.utils.Disposable {
    public java.lang.String fileName;
    public com.badlogic.gdx.audio.Sound sound;

    public SoundData(com.badlogic.gdx.audio.Sound r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.sound = r1
            r0.fileName = r2
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r2 = this;
            com.badlogic.gdx.audio.Sound r0 = r2.sound
            r1 = 0
            if (r0 == 0) goto La
            r0.dispose()
            r2.sound = r1
        La:
            r2.fileName = r1
            return
    }
}

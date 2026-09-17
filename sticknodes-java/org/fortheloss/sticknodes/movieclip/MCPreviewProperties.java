package org.fortheloss.sticknodes.movieclip;

/* loaded from: classes2.dex */
public class MCPreviewProperties implements com.badlogic.gdx.utils.Disposable {
    public int numFrames;
    public int numSounds;
    public int numSprites;
    public int numStickfigures;
    public com.badlogic.gdx.graphics.Pixmap[] previewFrames;

    public MCPreviewProperties() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.numFrames = r0
            r1.numStickfigures = r0
            r1.numSprites = r0
            r1.numSounds = r0
            return
    }

    @Override // com.badlogic.gdx.utils.Disposable
    public void dispose() {
            r3 = this;
            com.badlogic.gdx.graphics.Pixmap[] r0 = r3.previewFrames
            if (r0 == 0) goto L15
            r0 = 0
        L5:
            com.badlogic.gdx.graphics.Pixmap[] r1 = r3.previewFrames
            int r2 = r1.length
            if (r0 >= r2) goto L12
            r1 = r1[r0]
            r1.dispose()
            int r0 = r0 + 1
            goto L5
        L12:
            r0 = 0
            r3.previewFrames = r0
        L15:
            return
    }
}

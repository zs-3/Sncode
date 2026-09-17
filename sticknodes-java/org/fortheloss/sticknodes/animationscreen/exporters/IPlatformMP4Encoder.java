package org.fortheloss.sticknodes.animationscreen.exporters;

/* loaded from: classes2.dex */
public interface IPlatformMP4Encoder extends com.badlogic.gdx.utils.Disposable {
    boolean beginEncoding(java.io.File r1, int r2, int r3, int r4, boolean r5);

    boolean finishEncoding();

    void passPixels(byte[] r1);
}

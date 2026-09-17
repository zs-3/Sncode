package org.fortheloss.sticknodes.animationscreen.exporters;

/* loaded from: classes2.dex */
public interface IPlatformPNGEncoder extends com.badlogic.gdx.utils.Disposable {
    void begin(int r1, int r2, java.lang.String r3, java.lang.String r4, boolean r5);

    boolean isReadyForMorePixels();

    void passPixels(byte[] r1, boolean r2);
}

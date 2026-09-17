package org.fortheloss.sticknodes.animationscreen.exporters;

/* loaded from: classes2.dex */
public interface IThreadedMP4ExportLooper extends com.badlogic.gdx.utils.Disposable {
    boolean beginExport(java.lang.String r1, int r2, int r3, int r4, int r5, boolean r6, int r7);

    boolean beginExport(java.lang.String r1, int r2, int r3, int r4, int r5, boolean r6, boolean r7, int r8);

    java.lang.String getExportingStatusText();

    java.lang.String getFilename();

    float getPercentComplete();

    void requestCancel();

    int update();
}

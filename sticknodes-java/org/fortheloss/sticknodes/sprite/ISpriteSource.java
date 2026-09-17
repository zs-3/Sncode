package org.fortheloss.sticknodes.sprite;

/* loaded from: classes2.dex */
public interface ISpriteSource extends com.badlogic.gdx.utils.Disposable {
    int getLibraryId();

    java.lang.String getName();

    void readLibraryData(int r1, int r2, java.io.DataInputStream r3) throws java.io.IOException;

    void setLibraryId(int r1);

    void setName(java.lang.String r1);

    void writeLibraryData(java.io.OutputStream r1) throws java.io.IOException;
}

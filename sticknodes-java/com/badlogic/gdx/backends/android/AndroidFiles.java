package com.badlogic.gdx.backends.android;

/* loaded from: classes.dex */
public interface AndroidFiles extends com.badlogic.gdx.Files {
    @Override // com.badlogic.gdx.Files
    /* synthetic */ com.badlogic.gdx.files.FileHandle absolute(java.lang.String r1);

    @Override // com.badlogic.gdx.Files
    /* synthetic */ com.badlogic.gdx.files.FileHandle classpath(java.lang.String r1);

    @Override // com.badlogic.gdx.Files
    /* synthetic */ com.badlogic.gdx.files.FileHandle external(java.lang.String r1);

    com.badlogic.gdx.backends.android.ZipResourceFile getExpansionFile();

    @Override // com.badlogic.gdx.Files
    /* synthetic */ java.lang.String getExternalStoragePath();

    @Override // com.badlogic.gdx.Files
    /* synthetic */ com.badlogic.gdx.files.FileHandle getFileHandle(java.lang.String r1, com.badlogic.gdx.Files.FileType r2);

    @Override // com.badlogic.gdx.Files
    /* synthetic */ java.lang.String getLocalStoragePath();

    @Override // com.badlogic.gdx.Files
    /* synthetic */ com.badlogic.gdx.files.FileHandle internal(java.lang.String r1);

    @Override // com.badlogic.gdx.Files
    /* synthetic */ boolean isExternalStorageAvailable();

    /* synthetic */ boolean isLocalStorageAvailable();

    /* synthetic */ com.badlogic.gdx.files.FileHandle local(java.lang.String r1);

    boolean setAPKExpansion(int r1, int r2);
}

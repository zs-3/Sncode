package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes2.dex */
class CrashlyticsFileMarker {
    private final com.google.firebase.crashlytics.internal.persistence.FileStore fileStore;
    private final java.lang.String markerName;

    public CrashlyticsFileMarker(java.lang.String r1, com.google.firebase.crashlytics.internal.persistence.FileStore r2) {
            r0 = this;
            r0.<init>()
            r0.markerName = r1
            r0.fileStore = r2
            return
    }

    private java.io.File getMarkerFile() {
            r2 = this;
            com.google.firebase.crashlytics.internal.persistence.FileStore r0 = r2.fileStore
            java.lang.String r1 = r2.markerName
            java.io.File r0 = r0.getCommonFile(r1)
            return r0
    }

    public boolean create() {
            r4 = this;
            java.io.File r0 = r4.getMarkerFile()     // Catch: java.io.IOException -> L9
            boolean r0 = r0.createNewFile()     // Catch: java.io.IOException -> L9
            goto L25
        L9:
            r0 = move-exception
            com.google.firebase.crashlytics.internal.Logger r1 = com.google.firebase.crashlytics.internal.Logger.getLogger()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error creating marker: "
            r2.append(r3)
            java.lang.String r3 = r4.markerName
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.e(r2, r0)
            r0 = 0
        L25:
            return r0
    }

    public boolean isPresent() {
            r1 = this;
            java.io.File r0 = r1.getMarkerFile()
            boolean r0 = r0.exists()
            return r0
    }

    public boolean remove() {
            r1 = this;
            java.io.File r0 = r1.getMarkerFile()
            boolean r0 = r0.delete()
            return r0
    }
}

package com.google.android.gms.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
@java.lang.Deprecated
/* loaded from: classes2.dex */
public class AppMeasurementContentProvider extends android.content.ContentProvider {
    public AppMeasurementContentProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context r1, android.content.pm.ProviderInfo r2) {
            r0 = this;
            super.attachInfo(r1, r2)
            java.lang.String r1 = r2.authority
            java.lang.String r2 = "com.google.android.gms.measurement.google_measurement_service"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r1 = 0
            com.google.android.gms.measurement.internal.zzio.zzp(r0, r1, r1)
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}

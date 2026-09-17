package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public class zzt extends com.google.android.gms.drive.metadata.zza<java.lang.String> {
    public zzt(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = r1.getName()
            r2.putString(r0, r3)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.String zzb(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = r2.getString(r0)
            return r2
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.String zzc(com.google.android.gms.common.data.DataHolder r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = r2.getString(r0, r3, r4)
            return r2
    }
}

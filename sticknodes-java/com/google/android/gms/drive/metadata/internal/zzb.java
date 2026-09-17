package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public class zzb extends com.google.android.gms.drive.metadata.zza<java.lang.Boolean> {
    public zzb(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public zzb(java.lang.String r1, java.util.Collection<java.lang.String> r2, java.util.Collection<java.lang.String> r3, int r4) {
            r0 = this;
            r4 = 7000000(0x6acfc0, float:9.809089E-39)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle r2, java.lang.Boolean r3) {
            r1 = this;
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.String r0 = r1.getName()
            boolean r3 = r3.booleanValue()
            r2.putBoolean(r0, r3)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Boolean zzb(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            boolean r2 = r2.getBoolean(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected /* synthetic */ java.lang.Boolean zzc(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            java.lang.Boolean r1 = r0.zze(r1, r2, r3)
            return r1
    }

    protected java.lang.Boolean zze(com.google.android.gms.common.data.DataHolder r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            boolean r2 = r2.getBoolean(r0, r3, r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}

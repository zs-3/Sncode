package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public final class zzh extends com.google.android.gms.drive.metadata.zza<java.lang.Integer> {
    public zzh(java.lang.String r1, int r2) {
            r0 = this;
            r2 = 4300000(0x419ce0, float:6.025583E-39)
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ void zza(android.os.Bundle r2, java.lang.Integer r3) {
            r1 = this;
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.String r0 = r1.getName()
            int r3 = r3.intValue()
            r2.putInt(r0, r3)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Integer zzb(android.os.Bundle r2) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            int r2 = r2.getInt(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Integer zzc(com.google.android.gms.common.data.DataHolder r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            int r2 = r2.getInteger(r0, r3, r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }
}

package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzht extends com.google.android.gms.drive.metadata.internal.zzb {
    zzht(java.lang.String r1, java.util.Collection r2, java.util.Collection r3, int r4) {
            r0 = this;
            r4 = 7000000(0x6acfc0, float:9.809089E-39)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.drive.metadata.internal.zzb, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Boolean zzc(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            java.lang.Boolean r1 = r0.zze(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.drive.metadata.internal.zzb
    protected final java.lang.Boolean zze(com.google.android.gms.common.data.DataHolder r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "trashed"
            int r2 = r2.getInteger(r0, r3, r4)
            r3 = 2
            if (r2 != r3) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}

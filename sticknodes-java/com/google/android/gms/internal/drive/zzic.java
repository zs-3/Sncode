package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzic extends com.google.android.gms.drive.metadata.internal.zzb implements com.google.android.gms.drive.metadata.SearchableMetadataField<java.lang.Boolean> {
    public zzic(java.lang.String r1, int r2) {
            r0 = this;
            r2 = 4100000(0x3e8fa0, float:5.745324E-39)
            r0.<init>(r1, r2)
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
            java.lang.String r0 = r1.getName()
            int r2 = r2.getInteger(r0, r3, r4)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}

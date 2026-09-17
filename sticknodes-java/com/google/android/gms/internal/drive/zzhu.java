package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzhu extends com.google.android.gms.drive.metadata.internal.zzm<com.google.android.gms.common.data.BitmapTeleporter> {
    zzhu(java.lang.String r1, java.util.Collection r2, java.util.Collection r3, int r4) {
            r0 = this;
            r4 = 4400000(0x432380, float:6.165713E-39)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Thumbnail field is write only"
            r1.<init>(r2)
            throw r1
    }
}

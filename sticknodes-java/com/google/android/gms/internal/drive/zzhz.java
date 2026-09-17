package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzhz extends com.google.android.gms.drive.metadata.internal.zzl<com.google.android.gms.drive.DriveSpace> {
    public zzhz(int r4) {
            r3 = this;
            java.lang.String r4 = "inDriveSpace"
            java.lang.String r0 = "isAppData"
            java.lang.String r1 = "inGooglePhotosSpace"
            java.lang.String[] r4 = new java.lang.String[]{r4, r0, r1}
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.util.Set r0 = java.util.Collections.emptySet()
            java.lang.String r1 = "spaces"
            r2 = 7000000(0x6acfc0, float:9.809089E-39)
            r3.<init>(r1, r4, r0, r2)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zzb, com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            java.util.Collection r1 = r0.zzd(r1, r2, r3)
            return r1
    }

    @Override // com.google.android.gms.drive.metadata.zzb
    protected final java.util.Collection<com.google.android.gms.drive.DriveSpace> zzd(com.google.android.gms.common.data.DataHolder r3, int r4, int r5) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "inDriveSpace"
            boolean r1 = r3.getBoolean(r1, r4, r5)
            if (r1 == 0) goto L12
            com.google.android.gms.drive.DriveSpace r1 = com.google.android.gms.drive.DriveSpace.zzah
            r0.add(r1)
        L12:
            java.lang.String r1 = "isAppData"
            boolean r1 = r3.getBoolean(r1, r4, r5)
            if (r1 == 0) goto L1f
            com.google.android.gms.drive.DriveSpace r1 = com.google.android.gms.drive.DriveSpace.zzai
            r0.add(r1)
        L1f:
            java.lang.String r1 = "inGooglePhotosSpace"
            boolean r3 = r3.getBoolean(r1, r4, r5)
            if (r3 == 0) goto L2c
            com.google.android.gms.drive.DriveSpace r3 = com.google.android.gms.drive.DriveSpace.zzaj
            r0.add(r3)
        L2c:
            return r0
    }
}

package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
public final class zzim extends com.google.android.gms.drive.metadata.internal.zzm<com.google.android.gms.drive.DriveId> {
    public static final com.google.android.gms.internal.drive.zzim zzlj = null;

    static {
            com.google.android.gms.internal.drive.zzim r0 = new com.google.android.gms.internal.drive.zzim
            r0.<init>()
            com.google.android.gms.internal.drive.zzim.zzlj = r0
            return
    }

    private zzim() {
            r4 = this;
            java.lang.String r0 = "sqlId"
            java.lang.String r1 = "resourceId"
            java.lang.String r2 = "mimeType"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = "dbInstanceId"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r2 = "driveId"
            r3 = 4100000(0x3e8fa0, float:5.745324E-39)
            r4.<init>(r2, r0, r1, r3)
            return
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final boolean zzb(com.google.android.gms.common.data.DataHolder r1, int r2, int r3) {
            r0 = this;
            java.util.Collection r2 = r0.zzaz()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r1.hasColumn(r3)
            if (r3 != 0) goto L8
            r1 = 0
            return r1
        L1c:
            r1 = 1
            return r1
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder r10, int r11, int r12) {
            r9 = this;
            android.os.Bundle r0 = r10.getMetadata()
            java.lang.String r1 = "dbInstanceId"
            long r6 = r0.getLong(r1)
            com.google.android.gms.internal.drive.zzhx r0 = com.google.android.gms.internal.drive.zzhs.zzki
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r10.getString(r0, r11, r12)
            java.lang.String r1 = "application/vnd.google-apps.folder"
            boolean r8 = r1.equals(r0)
            java.lang.String r0 = "resourceId"
            java.lang.String r0 = r10.getString(r0, r11, r12)
            java.lang.String r1 = "sqlId"
            long r10 = r10.getLong(r1, r11, r12)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            com.google.android.gms.drive.DriveId r11 = new com.google.android.gms.drive.DriveId
            java.lang.String r12 = "generated-android-null"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L37
            r12 = 0
            r3 = r12
            goto L38
        L37:
            r3 = r0
        L38:
            long r4 = r10.longValue()
            r2 = r11
            r2.<init>(r3, r4, r6, r8)
            return r11
    }
}

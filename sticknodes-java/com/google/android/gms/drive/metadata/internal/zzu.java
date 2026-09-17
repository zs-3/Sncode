package com.google.android.gms.drive.metadata.internal;

/* loaded from: classes.dex */
public final class zzu extends com.google.android.gms.drive.metadata.internal.zzm<com.google.android.gms.drive.UserMetadata> {
    public zzu(java.lang.String r3, int r4) {
            r2 = this;
            r4 = 5
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r0 = "permissionId"
            java.lang.String r0 = zza(r3, r0)
            r1 = 0
            r4[r1] = r0
            java.lang.String r0 = "displayName"
            java.lang.String r0 = zza(r3, r0)
            r1 = 1
            r4[r1] = r0
            java.lang.String r0 = "picture"
            java.lang.String r0 = zza(r3, r0)
            r1 = 2
            r4[r1] = r0
            java.lang.String r0 = "isAuthenticatedUser"
            java.lang.String r0 = zza(r3, r0)
            r1 = 3
            r4[r1] = r0
            java.lang.String r0 = "emailAddress"
            java.lang.String r0 = zza(r3, r0)
            r1 = 4
            r4[r1] = r0
            java.util.List r4 = java.util.Arrays.asList(r4)
            java.util.List r0 = java.util.Collections.emptyList()
            r1 = 6000000(0x5b8d80, float:8.407791E-39)
            r2.<init>(r3, r4, r0, r1)
            return
    }

    private static java.lang.String zza(java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            int r0 = r0 + 1
            java.lang.String r1 = java.lang.String.valueOf(r3)
            int r1 = r1.length()
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r2 = "."
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = r1.toString()
            return r2
    }

    private final java.lang.String zzh(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = r1.getName()
            java.lang.String r2 = zza(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final boolean zzb(com.google.android.gms.common.data.DataHolder r3, int r4, int r5) {
            r2 = this;
            java.lang.String r0 = "permissionId"
            java.lang.String r1 = r2.zzh(r0)
            boolean r1 = r3.hasColumn(r1)
            if (r1 == 0) goto L18
            java.lang.String r0 = r2.zzh(r0)
            boolean r3 = r3.hasNull(r0, r4, r5)
            if (r3 != 0) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    @Override // com.google.android.gms.drive.metadata.zza
    protected final /* synthetic */ java.lang.Object zzc(com.google.android.gms.common.data.DataHolder r8, int r9, int r10) {
            r7 = this;
            java.lang.String r0 = "permissionId"
            java.lang.String r0 = r7.zzh(r0)
            java.lang.String r2 = r8.getString(r0, r9, r10)
            if (r2 == 0) goto L43
            java.lang.String r0 = "displayName"
            java.lang.String r0 = r7.zzh(r0)
            java.lang.String r3 = r8.getString(r0, r9, r10)
            java.lang.String r0 = "picture"
            java.lang.String r0 = r7.zzh(r0)
            java.lang.String r4 = r8.getString(r0, r9, r10)
            java.lang.String r0 = "isAuthenticatedUser"
            java.lang.String r0 = r7.zzh(r0)
            boolean r0 = r8.getBoolean(r0, r9, r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = "emailAddress"
            java.lang.String r1 = r7.zzh(r1)
            java.lang.String r6 = r8.getString(r1, r9, r10)
            com.google.android.gms.drive.UserMetadata r8 = new com.google.android.gms.drive.UserMetadata
            boolean r5 = r0.booleanValue()
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return r8
        L43:
            r8 = 0
            return r8
    }
}

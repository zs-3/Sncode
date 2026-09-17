package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfso {
    final java.io.File zza;
    private final java.io.File zzb;
    private final android.content.SharedPreferences zzc;
    private final int zzd;

    public zzfso(android.content.Context r3, int r4) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "pcvmspf"
            r1 = 0
            android.content.SharedPreferences r0 = r3.getSharedPreferences(r0, r1)
            r2.zzc = r0
            java.lang.String r0 = "pccache"
            java.io.File r0 = r3.getDir(r0, r1)
            com.google.android.gms.internal.ads.zzfsp.zza(r0, r1)
            r2.zzb = r0
            java.lang.String r0 = "tmppccache"
            java.io.File r3 = r3.getDir(r0, r1)
            r0 = 1
            com.google.android.gms.internal.ads.zzfsp.zza(r3, r0)
            r2.zza = r3
            r2.zzd = r4
            return
    }

    private final java.io.File zzd() {
            r3 = this;
            int r0 = r3.zzd
            java.io.File r1 = new java.io.File
            java.io.File r2 = r3.zzb
            int r0 = r0 + (-1)
            java.lang.String r0 = java.lang.Integer.toString(r0)
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L18
            r1.mkdir()
        L18:
            return r1
    }

    private final java.lang.String zze() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FBAMTD"
            r0.append(r1)
            int r1 = r2.zzd
            int r1 = r1 + (-1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private final java.lang.String zzf() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LATMTD"
            r0.append(r1)
            int r1 = r2.zzd
            int r1 = r1 + (-1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzayh r8, com.google.android.gms.internal.ads.zzfsu r9) {
            r7 = this;
            com.google.android.gms.internal.ads.zzayk r0 = r8.zzd()
            java.lang.String r0 = r0.zzk()
            com.google.android.gms.internal.ads.zzgzs r1 = r8.zzf()
            byte[] r1 = r1.zzA()
            com.google.android.gms.internal.ads.zzgzs r2 = r8.zze()
            byte[] r2 = r2.zzA()
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            if (r3 != 0) goto L185
            if (r2 == 0) goto L185
            int r3 = r2.length
            if (r3 != 0) goto L26
            goto L185
        L26:
            java.io.File r3 = r7.zza
            com.google.android.gms.internal.ads.zzfsp.zzd(r3)
            java.io.File r3 = r7.zza
            r3.mkdirs()
            java.io.File r3 = r7.zza
            java.io.File r3 = com.google.android.gms.internal.ads.zzfsp.zzc(r0, r3)
            r3.mkdirs()
            java.io.File r3 = r7.zza
            java.lang.String r5 = "pcam.jar"
            java.io.File r3 = com.google.android.gms.internal.ads.zzfsp.zzb(r0, r5, r3)
            if (r1 == 0) goto L4c
            int r6 = r1.length
            if (r6 <= 0) goto L4c
            boolean r1 = com.google.android.gms.internal.ads.zzfsp.zze(r3, r1)
            if (r1 == 0) goto L185
        L4c:
            java.io.File r1 = r7.zza
            java.lang.String r3 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.zzfsp.zzb(r0, r3, r1)
            boolean r0 = com.google.android.gms.internal.ads.zzfsp.zze(r0, r2)
            if (r0 == 0) goto L185
            com.google.android.gms.internal.ads.zzayk r0 = r8.zzd()
            java.lang.String r0 = r0.zzk()
            java.io.File r1 = r7.zza
            java.io.File r0 = com.google.android.gms.internal.ads.zzfsp.zzb(r0, r5, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L78
            if (r9 == 0) goto L78
            boolean r9 = r9.zza(r0)
            if (r9 == 0) goto L77
            goto L78
        L77:
            return r4
        L78:
            com.google.android.gms.internal.ads.zzayk r9 = r8.zzd()
            java.lang.String r9 = r9.zzk()
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r1 = 1
            if (r0 == 0) goto L8a
        L87:
            r8 = 0
            goto L13f
        L8a:
            java.io.File r0 = r7.zza
            java.io.File r0 = com.google.android.gms.internal.ads.zzfsp.zzb(r9, r5, r0)
            java.io.File r2 = r7.zza
            java.io.File r2 = com.google.android.gms.internal.ads.zzfsp.zzb(r9, r3, r2)
            java.io.File r6 = r7.zzd()
            java.io.File r5 = com.google.android.gms.internal.ads.zzfsp.zzb(r9, r5, r6)
            java.io.File r6 = r7.zzd()
            java.io.File r9 = com.google.android.gms.internal.ads.zzfsp.zzb(r9, r3, r6)
            boolean r3 = r0.exists()
            if (r3 == 0) goto Lb3
            boolean r0 = r0.renameTo(r5)
            if (r0 != 0) goto Lb3
            goto L87
        Lb3:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L87
            boolean r9 = r2.renameTo(r9)
            if (r9 == 0) goto L87
            com.google.android.gms.internal.ads.zzayj r9 = com.google.android.gms.internal.ads.zzayk.zze()
            com.google.android.gms.internal.ads.zzayk r0 = r8.zzd()
            java.lang.String r0 = r0.zzk()
            r9.zze(r0)
            com.google.android.gms.internal.ads.zzayk r0 = r8.zzd()
            java.lang.String r0 = r0.zzj()
            r9.zza(r0)
            com.google.android.gms.internal.ads.zzayk r0 = r8.zzd()
            long r2 = r0.zza()
            r9.zzb(r2)
            com.google.android.gms.internal.ads.zzayk r0 = r8.zzd()
            long r2 = r0.zzd()
            r9.zzd(r2)
            com.google.android.gms.internal.ads.zzayk r8 = r8.zzd()
            long r2 = r8.zzc()
            r9.zzc(r2)
            com.google.android.gms.internal.ads.zzhbe r8 = r9.zzbn()
            com.google.android.gms.internal.ads.zzayk r8 = (com.google.android.gms.internal.ads.zzayk) r8
            com.google.android.gms.internal.ads.zzayk r9 = r7.zzb(r1)
            android.content.SharedPreferences r0 = r7.zzc
            android.content.SharedPreferences$Editor r0 = r0.edit()
            if (r9 == 0) goto L129
            java.lang.String r2 = r8.zzk()
            java.lang.String r3 = r9.zzk()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L129
            java.lang.String r2 = r7.zze()
            byte[] r9 = r9.zzaV()
            java.lang.String r9 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r9)
            r0.putString(r2, r9)
        L129:
            java.lang.String r9 = r7.zzf()
            byte[] r8 = r8.zzaV()
            java.lang.String r8 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(r8)
            r0.putString(r9, r8)
            boolean r8 = r0.commit()
            if (r8 == 0) goto L87
            r8 = 1
        L13f:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            com.google.android.gms.internal.ads.zzayk r0 = r7.zzb(r1)
            if (r0 == 0) goto L151
            java.lang.String r0 = r0.zzk()
            r9.add(r0)
        L151:
            r0 = 2
            com.google.android.gms.internal.ads.zzayk r0 = r7.zzb(r0)
            if (r0 == 0) goto L15f
            java.lang.String r0 = r0.zzk()
            r9.add(r0)
        L15f:
            java.io.File r0 = r7.zzd()
            java.io.File[] r0 = r0.listFiles()
            int r1 = r0.length
        L168:
            if (r4 >= r1) goto L184
            r2 = r0[r4]
            java.lang.String r2 = r2.getName()
            boolean r3 = r9.contains(r2)
            if (r3 != 0) goto L181
            java.io.File r3 = r7.zzd()
            java.io.File r2 = com.google.android.gms.internal.ads.zzfsp.zzc(r2, r3)
            com.google.android.gms.internal.ads.zzfsp.zzd(r2)
        L181:
            int r4 = r4 + 1
            goto L168
        L184:
            return r8
        L185:
            return r4
    }

    final com.google.android.gms.internal.ads.zzayk zzb(int r6) {
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 != r1) goto Lf
            android.content.SharedPreferences r6 = r5.zzc
            java.lang.String r1 = r5.zzf()
            java.lang.String r6 = r6.getString(r1, r0)
            goto L19
        Lf:
            android.content.SharedPreferences r6 = r5.zzc
            java.lang.String r1 = r5.zze()
            java.lang.String r6 = r6.getString(r1, r0)
        L19:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L20
            return r0
        L20:
            byte[] r6 = com.google.android.gms.common.util.Hex.stringToBytes(r6)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            com.google.android.gms.internal.ads.zzgzs r1 = com.google.android.gms.internal.ads.zzgzs.zzb     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            r1 = 0
            int r2 = r6.length     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            com.google.android.gms.internal.ads.zzgzs r6 = com.google.android.gms.internal.ads.zzgzs.zzv(r6, r1, r2)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            com.google.android.gms.internal.ads.zzayk r6 = com.google.android.gms.internal.ads.zzayk.zzh(r6)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            java.lang.String r1 = r6.zzk()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            java.lang.String r2 = "pcam.jar"
            java.io.File r3 = r5.zzd()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            java.io.File r2 = com.google.android.gms.internal.ads.zzfsp.zzb(r1, r2, r3)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            boolean r3 = r2.exists()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            if (r3 != 0) goto L4e
            java.lang.String r2 = "pcam"
            java.io.File r3 = r5.zzd()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            java.io.File r2 = com.google.android.gms.internal.ads.zzfsp.zzb(r1, r2, r3)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
        L4e:
            java.lang.String r3 = "pcbc"
            java.io.File r4 = r5.zzd()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            java.io.File r1 = com.google.android.gms.internal.ads.zzfsp.zzb(r1, r3, r4)     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            boolean r2 = r2.exists()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            if (r2 == 0) goto L65
            boolean r1 = r1.exists()     // Catch: com.google.android.gms.internal.ads.zzhbt -> L65
            if (r1 == 0) goto L65
            return r6
        L65:
            return r0
    }

    public final com.google.android.gms.internal.ads.zzfsn zzc(int r6) {
            r5 = this;
            r6 = 1
            com.google.android.gms.internal.ads.zzayk r6 = r5.zzb(r6)
            if (r6 != 0) goto L9
            r6 = 0
            return r6
        L9:
            java.lang.String r0 = r6.zzk()
            java.io.File r1 = r5.zzd()
            java.lang.String r2 = "pcam.jar"
            java.io.File r1 = com.google.android.gms.internal.ads.zzfsp.zzb(r0, r2, r1)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L27
            java.io.File r1 = r5.zzd()
            java.lang.String r2 = "pcam"
            java.io.File r1 = com.google.android.gms.internal.ads.zzfsp.zzb(r0, r2, r1)
        L27:
            java.io.File r2 = r5.zzd()
            java.lang.String r3 = "pcopt"
            java.io.File r2 = com.google.android.gms.internal.ads.zzfsp.zzb(r0, r3, r2)
            java.io.File r3 = r5.zzd()
            java.lang.String r4 = "pcbc"
            java.io.File r0 = com.google.android.gms.internal.ads.zzfsp.zzb(r0, r4, r3)
            com.google.android.gms.internal.ads.zzfsn r3 = new com.google.android.gms.internal.ads.zzfsn
            r3.<init>(r6, r1, r0, r2)
            return r3
    }
}

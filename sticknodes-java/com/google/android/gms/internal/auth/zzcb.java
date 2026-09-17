package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzcb {
    public static final android.net.Uri zza = null;
    public static final android.net.Uri zzb = null;
    public static final java.util.regex.Pattern zzc = null;
    public static final java.util.regex.Pattern zzd = null;
    static java.util.HashMap zze;
    static final java.util.HashMap zzf = null;
    static final java.util.HashMap zzg = null;
    static final java.util.HashMap zzh = null;
    static final java.util.HashMap zzi = null;
    static boolean zzj;
    static final java.lang.String[] zzk = null;
    private static final java.util.concurrent.atomic.AtomicBoolean zzl = null;
    private static java.lang.Object zzm;

    static {
            java.lang.String r0 = "content://com.google.android.gsf.gservices"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.gms.internal.auth.zzcb.zza = r0
            java.lang.String r0 = "content://com.google.android.gsf.gservices/prefix"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.gms.internal.auth.zzcb.zzb = r0
            java.lang.String r0 = "^(1|true|t|on|yes|y)$"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.gms.internal.auth.zzcb.zzc = r0
            java.lang.String r0 = "^(0|false|f|off|no|n)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.gms.internal.auth.zzcb.zzd = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            com.google.android.gms.internal.auth.zzcb.zzl = r0
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 16
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2)
            com.google.android.gms.internal.auth.zzcb.zzf = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1, r2)
            com.google.android.gms.internal.auth.zzcb.zzg = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1, r2)
            com.google.android.gms.internal.auth.zzcb.zzh = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1, r2)
            com.google.android.gms.internal.auth.zzcb.zzi = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            com.google.android.gms.internal.auth.zzcb.zzk = r0
            return
    }

    public zzcb() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String zza(android.content.ContentResolver r11, java.lang.String r12, java.lang.String r13) {
            java.lang.Class<com.google.android.gms.internal.auth.zzcb> r13 = com.google.android.gms.internal.auth.zzcb.class
            monitor-enter(r13)
            java.util.HashMap r0 = com.google.android.gms.internal.auth.zzcb.zze     // Catch: java.lang.Throwable -> Lae
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L2e
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.internal.auth.zzcb.zzl     // Catch: java.lang.Throwable -> Lae
            r0.set(r2)     // Catch: java.lang.Throwable -> Lae
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lae
            r4 = 16
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.internal.auth.zzcb.zze = r0     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = new java.lang.Object     // Catch: java.lang.Throwable -> Lae
            r0.<init>()     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.internal.auth.zzcb.zzm = r0     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.internal.auth.zzcb.zzj = r2     // Catch: java.lang.Throwable -> Lae
            android.net.Uri r0 = com.google.android.gms.internal.auth.zzcb.zza     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.internal.auth.zzca r4 = new com.google.android.gms.internal.auth.zzca     // Catch: java.lang.Throwable -> Lae
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lae
            r11.registerContentObserver(r0, r1, r4)     // Catch: java.lang.Throwable -> Lae
            goto L58
        L2e:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.internal.auth.zzcb.zzl     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.getAndSet(r2)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L58
            java.util.HashMap r0 = com.google.android.gms.internal.auth.zzcb.zze     // Catch: java.lang.Throwable -> Lae
            r0.clear()     // Catch: java.lang.Throwable -> Lae
            java.util.HashMap r0 = com.google.android.gms.internal.auth.zzcb.zzf     // Catch: java.lang.Throwable -> Lae
            r0.clear()     // Catch: java.lang.Throwable -> Lae
            java.util.HashMap r0 = com.google.android.gms.internal.auth.zzcb.zzg     // Catch: java.lang.Throwable -> Lae
            r0.clear()     // Catch: java.lang.Throwable -> Lae
            java.util.HashMap r0 = com.google.android.gms.internal.auth.zzcb.zzh     // Catch: java.lang.Throwable -> Lae
            r0.clear()     // Catch: java.lang.Throwable -> Lae
            java.util.HashMap r0 = com.google.android.gms.internal.auth.zzcb.zzi     // Catch: java.lang.Throwable -> Lae
            r0.clear()     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = new java.lang.Object     // Catch: java.lang.Throwable -> Lae
            r0.<init>()     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.internal.auth.zzcb.zzm = r0     // Catch: java.lang.Throwable -> Lae
            com.google.android.gms.internal.auth.zzcb.zzj = r2     // Catch: java.lang.Throwable -> Lae
        L58:
            java.lang.Object r0 = com.google.android.gms.internal.auth.zzcb.zzm     // Catch: java.lang.Throwable -> Lae
            java.util.HashMap r4 = com.google.android.gms.internal.auth.zzcb.zze     // Catch: java.lang.Throwable -> Lae
            boolean r4 = r4.containsKey(r12)     // Catch: java.lang.Throwable -> Lae
            if (r4 == 0) goto L70
            java.util.HashMap r11 = com.google.android.gms.internal.auth.zzcb.zze     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r11 = r11.get(r12)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> Lae
            if (r11 != 0) goto L6d
            goto L6e
        L6d:
            r3 = r11
        L6e:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lae
            return r3
        L70:
            java.lang.String[] r4 = com.google.android.gms.internal.auth.zzcb.zzk     // Catch: java.lang.Throwable -> Lae
            int r4 = r4.length     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lae
            android.net.Uri r6 = com.google.android.gms.internal.auth.zzcb.zza
            r7 = 0
            r8 = 0
            java.lang.String[] r9 = new java.lang.String[r1]
            r9[r2] = r12
            r10 = 0
            r5 = r11
            android.database.Cursor r11 = r5.query(r6, r7, r8, r9, r10)
            if (r11 != 0) goto L85
            return r3
        L85:
            boolean r13 = r11.moveToFirst()     // Catch: java.lang.Throwable -> La9
            if (r13 != 0) goto L92
            zzc(r0, r12, r3)     // Catch: java.lang.Throwable -> La9
            r11.close()
            return r3
        L92:
            java.lang.String r13 = r11.getString(r1)     // Catch: java.lang.Throwable -> La9
            r11.close()
            if (r13 == 0) goto La2
            boolean r11 = r13.equals(r3)
            if (r11 == 0) goto La2
            r13 = r3
        La2:
            zzc(r0, r12, r13)
            if (r13 == 0) goto La8
            return r13
        La8:
            return r3
        La9:
            r12 = move-exception
            r11.close()
            throw r12
        Lae:
            r11 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> Lae
            throw r11
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicBoolean zzb() {
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.internal.auth.zzcb.zzl
            return r0
    }

    private static void zzc(java.lang.Object r2, java.lang.String r3, java.lang.String r4) {
            java.lang.Class<com.google.android.gms.internal.auth.zzcb> r0 = com.google.android.gms.internal.auth.zzcb.class
            monitor-enter(r0)
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzcb.zzm     // Catch: java.lang.Throwable -> Le
            if (r2 != r1) goto Lc
            java.util.HashMap r2 = com.google.android.gms.internal.auth.zzcb.zze     // Catch: java.lang.Throwable -> Le
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Le
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r2
    }
}

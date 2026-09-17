package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzqf extends com.google.android.gms.measurement.internal.zzjr {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.String[] zzb = null;
    private static final java.lang.String[] zzc = null;
    private java.security.SecureRandom zzd;
    private final java.util.concurrent.atomic.AtomicLong zze;
    private int zzf;
    private androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zzg;
    private java.lang.Boolean zzh;
    private java.lang.Integer zzi;

    static {
            java.lang.String r0 = "firebase_"
            java.lang.String r1 = "google_"
            java.lang.String r2 = "ga_"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            com.google.android.gms.measurement.internal.zzqf.zzb = r0
            java.lang.String r0 = "_err"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            com.google.android.gms.measurement.internal.zzqf.zzc = r0
            return
    }

    zzqf(com.google.android.gms.measurement.internal.zzio r3) {
            r2 = this;
            r2.<init>(r3)
            r3 = 0
            r2.zzi = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r0 = 0
            r3.<init>(r0)
            r2.zze = r3
            return
    }

    static java.security.MessageDigest zzI() {
            r0 = 0
        L1:
            r1 = 2
            if (r0 >= r1) goto L11
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> Le
            if (r1 != 0) goto Ld
            goto Le
        Ld:
            return r1
        Le:
            int r0 = r0 + 1
            goto L1
        L11:
            r0 = 0
            return r0
    }

    public static java.util.ArrayList zzK(java.util.List r6) {
            if (r6 != 0) goto L9
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 0
            r6.<init>(r0)
            return r6
        L9:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L16:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lc6
            java.lang.Object r1 = r6.next()
            com.google.android.gms.measurement.internal.zzai r1 = (com.google.android.gms.measurement.internal.zzai) r1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = r1.zza
            java.lang.String r4 = "app_id"
            r2.putString(r4, r3)
            java.lang.String r3 = r1.zzb
            java.lang.String r4 = "origin"
            r2.putString(r4, r3)
            long r3 = r1.zzd
            java.lang.String r5 = "creation_timestamp"
            r2.putLong(r5, r3)
            com.google.android.gms.measurement.internal.zzqb r3 = r1.zzc
            java.lang.String r3 = r3.zzb
            java.lang.String r4 = "name"
            r2.putString(r4, r3)
            com.google.android.gms.measurement.internal.zzqb r3 = r1.zzc
            java.lang.Object r3 = r3.zza()
            java.lang.Object r3 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.measurement.internal.zzjt.zzb(r2, r3)
            boolean r3 = r1.zze
            java.lang.String r4 = "active"
            r2.putBoolean(r4, r3)
            java.lang.String r3 = r1.zzf
            if (r3 == 0) goto L62
            java.lang.String r4 = "trigger_event_name"
            r2.putString(r4, r3)
        L62:
            com.google.android.gms.measurement.internal.zzbh r3 = r1.zzg
            if (r3 == 0) goto L7a
            java.lang.String r4 = r3.zza
            java.lang.String r5 = "timed_out_event_name"
            r2.putString(r5, r4)
            com.google.android.gms.measurement.internal.zzbf r3 = r3.zzb
            if (r3 == 0) goto L7a
            android.os.Bundle r3 = r3.zzc()
            java.lang.String r4 = "timed_out_event_params"
            r2.putBundle(r4, r3)
        L7a:
            long r3 = r1.zzh
            java.lang.String r5 = "trigger_timeout"
            r2.putLong(r5, r3)
            com.google.android.gms.measurement.internal.zzbh r3 = r1.zzi
            if (r3 == 0) goto L99
            java.lang.String r4 = r3.zza
            java.lang.String r5 = "triggered_event_name"
            r2.putString(r5, r4)
            com.google.android.gms.measurement.internal.zzbf r3 = r3.zzb
            if (r3 == 0) goto L99
            android.os.Bundle r3 = r3.zzc()
            java.lang.String r4 = "triggered_event_params"
            r2.putBundle(r4, r3)
        L99:
            com.google.android.gms.measurement.internal.zzqb r3 = r1.zzc
            long r3 = r3.zzc
            java.lang.String r5 = "triggered_timestamp"
            r2.putLong(r5, r3)
            long r3 = r1.zzj
            java.lang.String r5 = "time_to_live"
            r2.putLong(r5, r3)
            com.google.android.gms.measurement.internal.zzbh r1 = r1.zzk
            if (r1 == 0) goto Lc1
            java.lang.String r3 = r1.zza
            java.lang.String r4 = "expired_event_name"
            r2.putString(r4, r3)
            com.google.android.gms.measurement.internal.zzbf r1 = r1.zzb
            if (r1 == 0) goto Lc1
            android.os.Bundle r1 = r1.zzc()
            java.lang.String r3 = "expired_event_params"
            r2.putBundle(r3, r1)
        Lc1:
            r0.add(r2)
            goto L16
        Lc6:
            return r0
    }

    public static void zzN(com.google.android.gms.measurement.internal.zzmh r4, android.os.Bundle r5, boolean r6) {
            java.lang.String r0 = "_si"
            java.lang.String r1 = "_sn"
            java.lang.String r2 = "_sc"
            if (r5 == 0) goto L31
            if (r4 == 0) goto L31
            boolean r3 = r5.containsKey(r2)
            if (r3 == 0) goto L15
            if (r6 == 0) goto L13
            goto L15
        L13:
            r6 = 0
            goto L31
        L15:
            java.lang.String r6 = r4.zza
            if (r6 == 0) goto L1d
            r5.putString(r1, r6)
            goto L20
        L1d:
            r5.remove(r1)
        L20:
            java.lang.String r6 = r4.zzb
            if (r6 == 0) goto L28
            r5.putString(r2, r6)
            goto L2b
        L28:
            r5.remove(r2)
        L2b:
            long r1 = r4.zzc
            r5.putLong(r0, r1)
            return
        L31:
            if (r5 == 0) goto L40
            if (r4 != 0) goto L40
            if (r6 == 0) goto L40
            r5.remove(r1)
            r5.remove(r2)
            r5.remove(r0)
        L40:
            return
    }

    private final int zzaA(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "_ldl"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L10
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            r2.zzf()
            r2 = 2048(0x800, float:2.87E-42)
            return r2
        L10:
            java.lang.String r0 = "_id"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L20
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            r2.zzf()
            r2 = 256(0x100, float:3.59E-43)
            return r2
        L20:
            java.lang.String r0 = "_lgclid"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L30
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            r2.zzf()
            r2 = 100
            return r2
        L30:
            com.google.android.gms.measurement.internal.zzio r2 = r1.zzu
            r2.zzf()
            r2 = 36
            return r2
    }

    private final java.lang.Object zzaB(int r3, java.lang.Object r4, boolean r5, boolean r6, java.lang.String r7) {
            r2 = this;
            r7 = 0
            if (r4 != 0) goto L4
            return r7
        L4:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 != 0) goto Lb3
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto Le
            goto Lb3
        Le:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 == 0) goto L1e
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L1e:
            boolean r0 = r4 instanceof java.lang.Byte
            if (r0 == 0) goto L2e
            java.lang.Byte r4 = (java.lang.Byte) r4
            byte r3 = r4.byteValue()
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L2e:
            boolean r0 = r4 instanceof java.lang.Short
            if (r0 == 0) goto L3e
            java.lang.Short r4 = (java.lang.Short) r4
            short r3 = r4.shortValue()
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L3e:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto L55
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            r4 = 1
            if (r4 == r3) goto L4e
            r3 = 0
            goto L50
        L4e:
            r3 = 1
        L50:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            return r3
        L55:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L64
            java.lang.Float r4 = (java.lang.Float) r4
            double r3 = r4.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            return r3
        L64:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto Laa
            boolean r0 = r4 instanceof java.lang.Character
            if (r0 != 0) goto Laa
            boolean r0 = r4 instanceof java.lang.CharSequence
            if (r0 == 0) goto L71
            goto Laa
        L71:
            if (r6 == 0) goto La9
            boolean r3 = r4 instanceof android.os.Bundle[]
            if (r3 != 0) goto L7b
            boolean r3 = r4 instanceof android.os.Parcelable[]
            if (r3 == 0) goto La9
        L7b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.os.Parcelable[] r4 = (android.os.Parcelable[]) r4
            int r5 = r4.length
            r6 = 0
        L84:
            if (r6 >= r5) goto L9e
            r0 = r4[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L9b
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Bundle r0 = r2.zzz(r0, r7)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L9b
            r3.add(r0)
        L9b:
            int r6 = r6 + 1
            goto L84
        L9e:
            int r4 = r3.size()
            android.os.Bundle[] r4 = new android.os.Bundle[r4]
            java.lang.Object[] r3 = r3.toArray(r4)
            return r3
        La9:
            return r7
        Laa:
            java.lang.String r4 = r4.toString()
            java.lang.String r3 = r2.zzG(r4, r3, r5)
            return r3
        Lb3:
            return r4
    }

    private static boolean zzaC(java.lang.String r3, java.lang.String[] r4) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r0 = 0
            r1 = 0
        L5:
            int r2 = r4.length
            if (r1 >= r2) goto L15
            r2 = r4[r1]
            boolean r2 = java.util.Objects.equals(r3, r2)
            if (r2 == 0) goto L12
            r3 = 1
            return r3
        L12:
            int r1 = r1 + 1
            goto L5
        L15:
            return r0
    }

    static boolean zzap(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L10
            java.lang.String r0 = "_"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    static boolean zzaq(java.lang.String r3) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)
            r0 = 0
            char r1 = r3.charAt(r0)
            r2 = 95
            if (r1 != r2) goto L16
            java.lang.String r1 = "_ep"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L15
            goto L16
        L15:
            return r0
        L16:
            r3 = 1
            return r3
    }

    static boolean zzar(android.content.Context r4) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1e
            if (r1 != 0) goto Lb
            return r0
        Lb:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1e
            java.lang.String r3 = "com.google.android.gms.measurement.AppMeasurementReceiver"
            r2.<init>(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1e
            android.content.pm.ActivityInfo r4 = r1.getReceiverInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1e
            if (r4 == 0) goto L1e
            boolean r4 = r4.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1e
            if (r4 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            return r0
    }

    static boolean zzas(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            if (r1 != 0) goto L8
            return r0
        L8:
            android.content.ComponentName r2 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            r2.<init>(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            android.content.pm.ServiceInfo r3 = r1.getServiceInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            if (r3 == 0) goto L19
            boolean r3 = r3.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L19
            if (r3 == 0) goto L19
            r3 = 1
            return r3
        L19:
            return r0
    }

    static boolean zzat(android.content.Context r1, boolean r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r2 < r0) goto L10
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementJobService"
            boolean r1 = zzas(r1, r2)
            return r1
        L10:
            java.lang.String r2 = "com.google.android.gms.measurement.AppMeasurementService"
            boolean r1 = zzas(r1, r2)
            return r1
    }

    public static boolean zzau(java.lang.String r2) {
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzqf.zzc
            r1 = 0
            r0 = r0[r1]
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Lc
            return r1
        Lc:
            r2 = 1
            return r2
    }

    static final boolean zzaz(android.os.Bundle r6, int r7) {
            if (r6 != 0) goto L3
            goto L15
        L3:
            java.lang.String r0 = "_err"
            long r1 = r6.getLong(r0)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L15
            long r1 = (long) r7
            r6.putLong(r0, r1)
            r6 = 1
            return r6
        L15:
            r6 = 0
            return r6
    }

    static long zzr(byte[] r8) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            int r0 = r8.length
            r1 = 0
            if (r0 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            com.google.android.gms.common.internal.Preconditions.checkState(r2)
            r2 = 0
        Lf:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L23
            int r4 = r8.length
            int r4 = r4 + (-8)
            if (r0 < r4) goto L23
            r4 = r8[r0]
            long r4 = (long) r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            long r4 = r4 << r1
            long r2 = r2 + r4
            int r1 = r1 + 8
            goto Lf
        L23:
            return r2
    }

    final android.os.Bundle zzA(java.lang.String r22, java.lang.String r23, android.os.Bundle r24, java.util.List r25, boolean r26) {
            r21 = this;
            r9 = r21
            r10 = r23
            r11 = r24
            r12 = r25
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzjy.zzd
            boolean r13 = zzaC(r10, r0)
            if (r11 == 0) goto L10a
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>(r11)
            com.google.android.gms.measurement.internal.zzio r8 = r9.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r8.zzf()
            int r7 = r0.zze()
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r24.keySet()
            r0.<init>(r1)
            java.util.Iterator r16 = r0.iterator()
            r17 = 0
            r18 = 0
            r19 = 0
        L32:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L108
            java.lang.Object r0 = r16.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            if (r12 == 0) goto L4a
            boolean r0 = r12.contains(r6)
            if (r0 != 0) goto L48
            goto L4a
        L48:
            r0 = 0
            goto L58
        L4a:
            if (r26 != 0) goto L51
            int r0 = r9.zzi(r6)
            goto L52
        L51:
            r0 = 0
        L52:
            if (r0 != 0) goto L58
            int r0 = r9.zzh(r6)
        L58:
            if (r0 == 0) goto L6b
            r1 = 3
            if (r0 != r1) goto L5f
            r1 = r6
            goto L60
        L5f:
            r1 = 0
        L60:
            r9.zzM(r15, r0, r6, r1)
            r15.remove(r6)
            r12 = r7
            r20 = r8
            goto L100
        L6b:
            java.lang.Object r4 = r11.get(r6)
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r6
            r5 = r15
            r14 = r6
            r6 = r25
            r12 = r7
            r7 = r26
            r20 = r8
            r8 = r13
            int r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 17
            if (r0 != r1) goto L8e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.zzM(r15, r1, r14, r0)
            goto Laa
        L8e:
            if (r0 == 0) goto Laa
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto Laa
            r1 = 21
            if (r0 != r1) goto L9e
            r6 = r10
            goto L9f
        L9e:
            r6 = r14
        L9f:
            java.lang.Object r1 = r11.get(r14)
            r9.zzM(r15, r0, r6, r1)
            r15.remove(r14)
            goto L100
        Laa:
            boolean r0 = zzaq(r14)
            if (r0 == 0) goto L100
            int r0 = r18 + 1
            if (r0 <= r12) goto Lfd
            com.google.android.gms.measurement.internal.zzam r1 = r20.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzbr
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            if (r1 == 0) goto Lc3
            if (r19 != 0) goto Lf4
        Lc3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Event can't contain more than "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r2 = " params"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.google.android.gms.measurement.internal.zzhe r2 = r20.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgx r4 = r20.zzj()
            java.lang.String r4 = r4.zzd(r10)
            com.google.android.gms.measurement.internal.zzgx r5 = r20.zzj()
            java.lang.String r5 = r5.zzb(r11)
            r2.zzc(r1, r4, r5)
        Lf4:
            r1 = 5
            zzaz(r15, r1)
            r15.remove(r14)
            r19 = 1
        Lfd:
            r18 = r0
            goto L101
        L100:
            r3 = 0
        L101:
            r7 = r12
            r8 = r20
            r12 = r25
            goto L32
        L108:
            r14 = r15
            goto L10c
        L10a:
            r3 = 0
            r14 = r3
        L10c:
            return r14
    }

    final androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures zzB() {
            r1 = this;
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r0 = r1.zzg
            if (r0 != 0) goto L10
            com.google.android.gms.measurement.internal.zzio r0 = r1.zzu
            android.content.Context r0 = r0.zzaT()
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r0 = androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures.from(r0)
            r1.zzg = r0
        L10:
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r0 = r1.zzg
            return r0
    }

    final com.google.android.gms.measurement.internal.zzbh zzC(java.lang.String r7, java.lang.String r8, android.os.Bundle r9, java.lang.String r10, long r11, boolean r13, boolean r14) {
            r6 = this;
            boolean r14 = android.text.TextUtils.isEmpty(r8)
            if (r14 == 0) goto L8
            r7 = 0
            return r7
        L8:
            int r14 = r6.zzf(r8)
            if (r14 != 0) goto L45
            if (r9 == 0) goto L16
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r9)
            goto L1b
        L16:
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>()
        L1b:
            r3 = r14
            java.lang.String r9 = "_o"
            r3.putString(r9, r10)
            java.util.List r4 = com.google.android.gms.common.util.CollectionUtils.listOf(r9)
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            android.os.Bundle r9 = r0.zzA(r1, r2, r3, r4, r5)
            if (r13 == 0) goto L33
            android.os.Bundle r9 = r6.zzz(r9, r7)
        L33:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            com.google.android.gms.measurement.internal.zzbh r7 = new com.google.android.gms.measurement.internal.zzbh
            com.google.android.gms.measurement.internal.zzbf r2 = new com.google.android.gms.measurement.internal.zzbf
            r2.<init>(r9)
            r0 = r7
            r1 = r8
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4)
            return r7
        L45:
            com.google.android.gms.measurement.internal.zzio r7 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r9 = r7.zzaW()
            com.google.android.gms.measurement.internal.zzhc r9 = r9.zze()
            com.google.android.gms.measurement.internal.zzgx r7 = r7.zzj()
            java.lang.String r7 = r7.zzf(r8)
            java.lang.String r8 = "Invalid conditional property event name"
            r9.zzb(r8, r7)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
    }

    final java.lang.Object zzD(java.lang.String r10, java.lang.Object r11) {
            r9 = this;
            java.lang.String r0 = "_ev"
            boolean r0 = r0.equals(r10)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1e
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzam r10 = r10.zzf()
            int r4 = r10.zzd(r2, r1)
            r6 = 1
            r7 = 1
            r8 = 0
            r3 = r9
            r5 = r11
            java.lang.Object r10 = r3.zzaB(r4, r5, r6, r7, r8)
            return r10
        L1e:
            boolean r10 = zzap(r10)
            if (r10 == 0) goto L2f
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzam r10 = r10.zzf()
            int r10 = r10.zzd(r2, r1)
            goto L39
        L2f:
            com.google.android.gms.measurement.internal.zzio r10 = r9.zzu
            com.google.android.gms.measurement.internal.zzam r10 = r10.zzf()
            int r10 = r10.zzc(r2, r1)
        L39:
            r1 = r10
            r3 = 0
            r4 = 1
            r5 = 0
            r0 = r9
            r2 = r11
            java.lang.Object r10 = r0.zzaB(r1, r2, r3, r4, r5)
            return r10
    }

    final java.lang.Object zzE(java.lang.String r8, java.lang.Object r9) {
            r7 = this;
            java.lang.String r0 = "_ldl"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L16
            int r2 = r7.zzaA(r8)
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r7
            r3 = r9
            java.lang.Object r8 = r1.zzaB(r2, r3, r4, r5, r6)
            return r8
        L16:
            int r1 = r7.zzaA(r8)
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r7
            r2 = r9
            java.lang.Object r8 = r0.zzaB(r1, r2, r3, r4, r5)
            return r8
    }

    final java.lang.String zzF() {
            r5 = this;
            r0 = 16
            byte[] r0 = new byte[r0]
            java.security.SecureRandom r1 = r5.zzJ()
            r1.nextBytes(r0)
            java.util.Locale r1 = java.util.Locale.US
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.math.BigInteger r4 = new java.math.BigInteger
            r4.<init>(r2, r0)
            r0 = 0
            r3[r0] = r4
            java.lang.String r0 = "%032x"
            java.lang.String r0 = java.lang.String.format(r1, r0, r3)
            return r0
    }

    public final java.lang.String zzG(java.lang.String r4, int r5, boolean r6) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length()
            r2 = 0
            int r1 = r4.codePointCount(r2, r1)
            if (r1 <= r5) goto L25
            if (r6 == 0) goto L24
            int r5 = r4.offsetByCodePoints(r2, r5)
            java.lang.String r4 = r4.substring(r2, r5)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "..."
            java.lang.String r4 = r4.concat(r5)
            return r4
        L24:
            return r0
        L25:
            return r4
    }

    public final java.net.URL zzH(long r7, java.lang.String r9, java.lang.String r10, long r11, java.lang.String r13) {
            r6 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            java.lang.String r7 = "xGN4Vue"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            java.lang.String r0 = "v%s.%s"
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r3 = 119002(0x1d0da, double:5.8795E-319)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            int r3 = r6.zzm()     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r5 = 1
            r2[r5] = r3     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r8[r4] = r0     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r8[r5] = r10     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r8[r1] = r9     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r10 = 3
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r8[r10] = r11     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            com.google.android.gms.measurement.internal.zzio r8 = r6.zzu     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            com.google.android.gms.measurement.internal.zzam r8 = r8.zzf()     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            java.lang.String r8 = r8.zzp()     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            boolean r8 = r9.equals(r8)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            if (r8 == 0) goto L50
            java.lang.String r8 = "&ddl_test=1"
            java.lang.String r7 = r7.concat(r8)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
        L50:
            boolean r8 = r13.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            if (r8 != 0) goto L68
            char r8 = r13.charAt(r4)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r9 = 38
            if (r8 == r9) goto L64
            java.lang.String r8 = "&"
            java.lang.String r7 = r7.concat(r8)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
        L64:
            java.lang.String r7 = r7.concat(r13)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
        L68:
            java.net.URL r8 = new java.net.URL     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            r8.<init>(r7)     // Catch: java.lang.IllegalArgumentException -> L6e java.net.MalformedURLException -> L70
            return r8
        L6e:
            r7 = move-exception
            goto L71
        L70:
            r7 = move-exception
        L71:
            com.google.android.gms.measurement.internal.zzio r8 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zze()
            java.lang.String r7 = r7.getMessage()
            java.lang.String r9 = "Failed to create BOW URL for Deferred Deep Link. exception"
            r8.zzb(r9, r7)
            r7 = 0
            return r7
    }

    final java.security.SecureRandom zzJ() {
            r1 = this;
            r1.zzg()
            java.security.SecureRandom r0 = r1.zzd
            if (r0 != 0) goto Le
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            r1.zzd = r0
        Le:
            java.security.SecureRandom r0 = r1.zzd
            return r0
    }

    final void zzL(android.os.Bundle r7, long r8) {
            r6 = this;
            java.lang.String r0 = "_et"
            long r1 = r7.getLong(r0)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L20
            com.google.android.gms.measurement.internal.zzio r3 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            java.lang.String r5 = "Params already contained engagement"
            r3.zzb(r5, r4)
            goto L21
        L20:
            r1 = r3
        L21:
            long r8 = r8 + r1
            r7.putLong(r0, r8)
            return
    }

    final void zzM(android.os.Bundle r2, int r3, java.lang.String r4, java.lang.Object r5) {
            r1 = this;
            boolean r3 = zzaz(r2, r3)
            if (r3 == 0) goto L32
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu
            r3.zzf()
            r3 = 40
            r0 = 1
            java.lang.String r3 = r1.zzG(r4, r3, r0)
            java.lang.String r4 = "_ev"
            r2.putString(r4, r3)
            if (r5 == 0) goto L32
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            boolean r3 = r5 instanceof java.lang.String
            if (r3 != 0) goto L24
            boolean r3 = r5 instanceof java.lang.CharSequence
            if (r3 == 0) goto L32
        L24:
            java.lang.String r3 = r5.toString()
            int r3 = r3.length()
            long r3 = (long) r3
            java.lang.String r5 = "_el"
            r2.putLong(r5, r3)
        L32:
            return
    }

    final void zzO(android.os.Bundle r5, android.os.Bundle r6) {
            r4 = this;
            if (r6 != 0) goto L3
            goto L2b
        L3:
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r5.containsKey(r1)
            if (r2 != 0) goto Lb
            com.google.android.gms.measurement.internal.zzio r2 = r4.zzu
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            java.lang.Object r3 = r6.get(r1)
            r2.zzS(r5, r1, r3)
            goto Lb
        L2b:
            return
    }

    final void zzP(android.os.Parcelable[] r13, int r14) {
            r12 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)
            int r0 = r13.length
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L89
            r3 = r13[r2]
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.TreeSet r4 = new java.util.TreeSet
            java.util.Set r5 = r3.keySet()
            r4.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 0
        L1b:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L85
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = zzaq(r7)
            if (r8 == 0) goto L1b
            java.lang.String[] r8 = com.google.android.gms.measurement.internal.zzjz.zzd
            boolean r8 = zzaC(r7, r8)
            if (r8 != 0) goto L1b
            int r5 = r5 + 1
            if (r5 <= r14) goto L1b
            com.google.android.gms.measurement.internal.zzio r8 = r12.zzu
            com.google.android.gms.measurement.internal.zzam r9 = r8.zzf()
            r10 = 0
            com.google.android.gms.measurement.internal.zzgg r11 = com.google.android.gms.measurement.internal.zzgi.zzbr
            boolean r9 = r9.zzx(r10, r11)
            if (r9 == 0) goto L4a
            if (r6 != 0) goto L7b
        L4a:
            com.google.android.gms.measurement.internal.zzhe r6 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzf()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Param can't contain more than "
            r9.append(r10)
            r9.append(r14)
            java.lang.String r10 = " item-scoped custom parameters"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.google.android.gms.measurement.internal.zzgx r10 = r8.zzj()
            java.lang.String r10 = r10.zze(r7)
            com.google.android.gms.measurement.internal.zzgx r8 = r8.zzj()
            java.lang.String r8 = r8.zzb(r3)
            r6.zzc(r9, r10, r8)
        L7b:
            r6 = 28
            zzaz(r3, r6)
            r3.remove(r7)
            r6 = 1
            goto L1b
        L85:
            int r2 = r2 + 1
            goto L6
        L89:
            return
    }

    final void zzQ(com.google.android.gms.measurement.internal.zzhf r10, int r11) {
            r9 = this;
            java.util.TreeSet r0 = new java.util.TreeSet
            android.os.Bundle r1 = r10.zzd
            java.util.Set r2 = r1.keySet()
            r0.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L11:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L74
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = zzaq(r4)
            if (r5 == 0) goto L11
            int r2 = r2 + 1
            if (r2 <= r11) goto L11
            com.google.android.gms.measurement.internal.zzio r5 = r9.zzu
            com.google.android.gms.measurement.internal.zzam r6 = r5.zzf()
            r7 = 0
            com.google.android.gms.measurement.internal.zzgg r8 = com.google.android.gms.measurement.internal.zzgi.zzbr
            boolean r6 = r6.zzx(r7, r8)
            if (r6 == 0) goto L38
            if (r3 != 0) goto L6f
        L38:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Event can't contain more than "
            r3.append(r6)
            r3.append(r11)
            java.lang.String r6 = " params"
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.google.android.gms.measurement.internal.zzhe r6 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzf()
            com.google.android.gms.measurement.internal.zzgx r7 = r5.zzj()
            java.lang.String r8 = r10.zza
            java.lang.String r7 = r7.zzd(r8)
            com.google.android.gms.measurement.internal.zzgx r5 = r5.zzj()
            java.lang.String r5 = r5.zzb(r1)
            r6.zzc(r3, r7, r5)
            r3 = 5
            zzaz(r1, r3)
        L6f:
            r1.remove(r4)
            r3 = 1
            goto L11
        L74:
            return
    }

    final void zzR(com.google.android.gms.measurement.internal.zzqe r3, java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7, int r8) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            zzaz(r0, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L17
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L17
            r0.putString(r6, r7)
        L17:
            r6 = 6
            if (r5 == r6) goto L20
            r6 = 7
            if (r5 == r6) goto L20
            r6 = 2
            if (r5 != r6) goto L26
        L20:
            long r5 = (long) r8
            java.lang.String r7 = "_el"
            r0.putLong(r7, r5)
        L26:
            java.lang.String r5 = "_err"
            r3.zza(r4, r5, r0)
            return
    }

    final void zzS(android.os.Bundle r3, java.lang.String r4, java.lang.Object r5) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L5a
        L3:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L11
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            r3.putLong(r4, r0)
            return
        L11:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L1d
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.putString(r4, r5)
            return
        L1d:
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 == 0) goto L2b
            java.lang.Double r5 = (java.lang.Double) r5
            double r0 = r5.doubleValue()
            r3.putDouble(r4, r0)
            return
        L2b:
            boolean r0 = r5 instanceof android.os.Bundle[]
            if (r0 == 0) goto L35
            android.os.Bundle[] r5 = (android.os.Bundle[]) r5
            r3.putParcelableArray(r4, r5)
            return
        L35:
            if (r4 == 0) goto L5a
            if (r5 == 0) goto L42
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getSimpleName()
            goto L43
        L42:
            r3 = 0
        L43:
            com.google.android.gms.measurement.internal.zzio r5 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzl()
            com.google.android.gms.measurement.internal.zzgx r5 = r5.zzj()
            java.lang.String r4 = r5.zze(r4)
            java.lang.String r5 = "Not putting event parameter. Invalid value type. name, type"
            r0.zzc(r5, r4, r3)
        L5a:
            return
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcy r3, boolean r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putBoolean(r1, r4)
            r3.zze(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.String r0 = "Error returning boolean value to wrapper"
            r4.zzb(r0, r3)
            return
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcy r3, java.util.ArrayList r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putParcelableArrayList(r1, r4)
            r3.zze(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.String r0 = "Error returning bundle list to wrapper"
            r4.zzb(r0, r3)
            return
    }

    public final void zzV(com.google.android.gms.internal.measurement.zzcy r2, android.os.Bundle r3) {
            r1 = this;
            r2.zze(r3)     // Catch: android.os.RemoteException -> L4
            return
        L4:
            r2 = move-exception
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.String r0 = "Error returning bundle value to wrapper"
            r3.zzb(r0, r2)
            return
    }

    public final void zzW(com.google.android.gms.internal.measurement.zzcy r3, byte[] r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putByteArray(r1, r4)
            r3.zze(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.String r0 = "Error returning byte array to wrapper"
            r4.zzb(r0, r3)
            return
    }

    public final void zzX(com.google.android.gms.internal.measurement.zzcy r3, int r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putInt(r1, r4)
            r3.zze(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.String r0 = "Error returning int value to wrapper"
            r4.zzb(r0, r3)
            return
    }

    public final void zzY(com.google.android.gms.internal.measurement.zzcy r3, long r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putLong(r1, r4)
            r3.zze(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.String r5 = "Error returning long value to wrapper"
            r4.zzb(r5, r3)
            return
    }

    public final void zzZ(com.google.android.gms.internal.measurement.zzcy r3, java.lang.String r4) {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "r"
            r0.putString(r1, r4)
            r3.zze(r0)     // Catch: android.os.RemoteException -> Le
            return
        Le:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.String r0 = "Error returning string value to wrapper"
            r4.zzb(r0, r3)
            return
    }

    final int zza(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
            r13 = this;
            r7 = r13
            r8 = r16
            r0 = r17
            r1 = r18
            r13.zzg()
            boolean r2 = r13.zzal(r0)
            java.lang.String r3 = "param"
            r4 = 17
            r5 = 0
            if (r2 == 0) goto La9
            if (r21 == 0) goto La6
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.zzjz.zzc
            boolean r2 = zzaC(r8, r2)
            if (r2 != 0) goto L22
            r0 = 20
            return r0
        L22:
            com.google.android.gms.measurement.internal.zzio r2 = r7.zzu
            com.google.android.gms.measurement.internal.zzny r2 = r2.zzu()
            r2.zzg()
            r2.zza()
            boolean r6 = r2.zzad()
            if (r6 != 0) goto L35
            goto L47
        L35:
            com.google.android.gms.measurement.internal.zzio r2 = r2.zzu
            com.google.android.gms.measurement.internal.zzqf r2 = r2.zzw()
            int r2 = r2.zzm()
            r6 = 200900(0x310c4, float:2.81521E-40)
            if (r2 >= r6) goto L47
            r0 = 25
            return r0
        L47:
            com.google.android.gms.measurement.internal.zzio r2 = r7.zzu
            r2.zzf()
            boolean r6 = r0 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L55
            r9 = r0
            android.os.Parcelable[] r9 = (android.os.Parcelable[]) r9
            int r9 = r9.length
            goto L60
        L55:
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 == 0) goto La9
            r9 = r0
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r9 = r9.size()
        L60:
            r10 = 200(0xc8, float:2.8E-43)
            if (r9 <= r10) goto La9
            com.google.android.gms.measurement.internal.zzhe r11 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r11 = r11.zzl()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r12 = "Parameter array is too long; discarded. Value kind, name, array length"
            r11.zzd(r12, r3, r8, r9)
            r2.zzf()
            if (r6 == 0) goto L8a
            r2 = r0
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            int r6 = r2.length
            if (r6 <= r10) goto La3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r10)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto La3
        L8a:
            boolean r2 = r0 instanceof java.util.ArrayList
            if (r2 == 0) goto La3
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r6 = r2.size()
            if (r6 <= r10) goto La3
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r2.subList(r5, r10)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        La3:
            r9 = 17
            goto Laa
        La6:
            r0 = 21
            return r0
        La9:
            r9 = 0
        Laa:
            boolean r1 = zzap(r15)
            r2 = 0
            if (r1 != 0) goto Lc3
            boolean r1 = zzap(r16)
            if (r1 == 0) goto Lb8
            goto Lc3
        Lb8:
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r1.zzf()
            int r1 = r1.zzc(r2, r5)
            goto Lcd
        Lc3:
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r1.zzf()
            int r1 = r1.zzd(r2, r5)
        Lcd:
            boolean r1 = r13.zzaf(r3, r8, r1, r0)
            if (r1 == 0) goto Ld4
            return r9
        Ld4:
            if (r21 == 0) goto L164
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto Leb
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.zzaa(r1, r2, r3, r4, r5, r6)
            goto L163
        Leb:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L122
            r10 = r0
            android.os.Parcelable[] r10 = (android.os.Parcelable[]) r10
            int r11 = r10.length
            r12 = 0
        Lf4:
            if (r12 >= r11) goto L163
            r0 = r10[r12]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L110
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzl()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.zzc(r2, r0, r8)
            goto L164
        L110:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.zzaa(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto Lf4
        L122:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L164
            r10 = r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r11 = r10.size()
            r12 = 0
        L12e:
            if (r12 >= r11) goto L163
            java.lang.Object r0 = r10.get(r12)
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L151
            com.google.android.gms.measurement.internal.zzio r1 = r7.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzl()
            if (r0 == 0) goto L149
            java.lang.Class r0 = r0.getClass()
            goto L14b
        L149:
            java.lang.String r0 = "null"
        L14b:
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r1.zzc(r2, r0, r8)
            goto L164
        L151:
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r19
            r6 = r20
            r0.zzaa(r1, r2, r3, r4, r5, r6)
            int r12 = r12 + 1
            goto L12e
        L163:
            return r9
        L164:
            r0 = 4
            return r0
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final void zzaZ() {
            r6 = this;
            r6.zzg()
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            long r1 = r0.nextLong()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L29
            long r1 = r0.nextLong()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L29
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzk()
            java.lang.String r3 = "Utils falling back to Random for random id"
            r0.zza(r3)
        L29:
            java.util.concurrent.atomic.AtomicLong r0 = r6.zze
            r0.set(r1)
            return
    }

    final void zzaa(java.lang.String r23, java.lang.String r24, java.lang.String r25, android.os.Bundle r26, java.util.List r27, boolean r28) {
            r22 = this;
            r9 = r22
            r10 = r24
            r11 = r26
            r12 = r27
            if (r11 != 0) goto Lc
            goto L16b
        Lc:
            com.google.android.gms.measurement.internal.zzio r13 = r9.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r13.zzf()
            com.google.android.gms.measurement.internal.zzio r0 = r0.zzu
            com.google.android.gms.measurement.internal.zzqf r0 = r0.zzw()
            r14 = 231100000(0xdc64e60, float:1.222156E-30)
            r15 = 1
            boolean r0 = r0.zzao(r14, r15)
            r16 = 0
            if (r15 == r0) goto L26
            r8 = 0
            goto L2a
        L26:
            r0 = 35
            r8 = 35
        L2a:
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r26.keySet()
            r0.<init>(r1)
            java.util.Iterator r17 = r0.iterator()
            r18 = 0
            r19 = 0
        L3b:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L16b
            java.lang.Object r0 = r17.next()
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            if (r12 == 0) goto L53
            boolean r0 = r12.contains(r7)
            if (r0 != 0) goto L51
            goto L53
        L51:
            r0 = 0
            goto L61
        L53:
            if (r28 != 0) goto L5a
            int r0 = r9.zzi(r7)
            goto L5b
        L5a:
            r0 = 0
        L5b:
            if (r0 != 0) goto L61
            int r0 = r9.zzh(r7)
        L61:
            r6 = 0
            if (r0 == 0) goto L74
            r1 = 3
            if (r0 != r1) goto L68
            r6 = r7
        L68:
            r9.zzM(r11, r0, r7, r6)
            r11.remove(r7)
            r2 = r8
        L6f:
            r1 = 231100000(0xdc64e60, float:1.222156E-30)
            goto L165
        L74:
            java.lang.Object r0 = r11.get(r7)
            boolean r0 = r9.zzal(r0)
            if (r0 == 0) goto L93
            com.google.android.gms.measurement.internal.zzhe r0 = r13.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzl()
            java.lang.String r1 = "Nested Bundle parameters are not allowed; discarded. event name, param name, child param name"
            r5 = r25
            r0.zzd(r1, r10, r5, r7)
            r0 = 22
            r14 = r7
            r21 = r8
            goto Lb1
        L93:
            r5 = r25
            java.lang.Object r4 = r11.get(r7)
            r20 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r7
            r5 = r26
            r6 = r27
            r14 = r7
            r7 = r28
            r21 = r8
            r8 = r20
            int r0 = r0.zza(r1, r2, r3, r4, r5, r6, r7, r8)
        Lb1:
            if (r0 == 0) goto Lc7
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto Lc7
            java.lang.Object r1 = r11.get(r14)
            r9.zzM(r11, r0, r14, r1)
            r11.remove(r14)
            goto L161
        Lc7:
            boolean r0 = zzaq(r14)
            if (r0 == 0) goto L161
            java.lang.String[] r0 = com.google.android.gms.measurement.internal.zzjz.zzd
            boolean r0 = zzaC(r14, r0)
            if (r0 != 0) goto L161
            int r0 = r18 + 1
            r1 = 231100000(0xdc64e60, float:1.222156E-30)
            boolean r2 = r9.zzao(r1, r15)
            if (r2 != 0) goto L108
            com.google.android.gms.measurement.internal.zzhe r2 = r13.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzf()
            com.google.android.gms.measurement.internal.zzgx r3 = r13.zzj()
            java.lang.String r3 = r3.zzd(r10)
            com.google.android.gms.measurement.internal.zzgx r4 = r13.zzj()
            java.lang.String r4 = r4.zzb(r11)
            java.lang.String r5 = "Item array not supported on client's version of Google Play Services (Android Only)"
            r2.zzc(r5, r3, r4)
            r2 = 23
            zzaz(r11, r2)
            r11.remove(r14)
            r2 = r21
            goto L15e
        L108:
            r2 = r21
            if (r0 <= r2) goto L15e
            com.google.android.gms.measurement.internal.zzam r3 = r13.zzf()
            com.google.android.gms.measurement.internal.zzgg r4 = com.google.android.gms.measurement.internal.zzgi.zzbr
            r5 = 0
            boolean r3 = r3.zzx(r5, r4)
            if (r3 == 0) goto L11b
            if (r19 != 0) goto L14c
        L11b:
            com.google.android.gms.measurement.internal.zzhe r3 = r13.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzf()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Item can't contain more than "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r5 = " item-scoped custom params"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.google.android.gms.measurement.internal.zzgx r5 = r13.zzj()
            java.lang.String r5 = r5.zzd(r10)
            com.google.android.gms.measurement.internal.zzgx r6 = r13.zzj()
            java.lang.String r6 = r6.zzb(r11)
            r3.zzc(r4, r5, r6)
        L14c:
            r3 = 28
            zzaz(r11, r3)
            r11.remove(r14)
            r18 = r0
            r8 = r2
            r14 = 231100000(0xdc64e60, float:1.222156E-30)
            r19 = 1
            goto L3b
        L15e:
            r18 = r0
            goto L165
        L161:
            r2 = r21
            goto L6f
        L165:
            r8 = r2
            r14 = 231100000(0xdc64e60, float:1.222156E-30)
            goto L3b
        L16b:
            return
    }

    final boolean zzab(java.lang.String r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzaq
            r1 = 0
            java.lang.Object r0 = r0.zza(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "*"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L24
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L22
            goto L24
        L22:
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    final boolean zzac(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzam r1 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r2 = com.google.android.gms.measurement.internal.zzgi.zzbp
            r3 = 0
            boolean r1 = r1.zzx(r3, r2)
            java.lang.String r2 = "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id"
            java.lang.String r3 = "Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI"
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L50
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L3a
            boolean r8 = r6.zzax(r7)
            if (r8 != 0) goto L43
            com.google.android.gms.measurement.internal.zzio r8 = r6.zzu
            boolean r8 = r8.zzL()
            if (r8 != 0) goto L2a
            goto L42
        L2a:
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzf()
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)
            r8.zzb(r2, r7)
            return r5
        L3a:
            com.google.android.gms.measurement.internal.zzio r7 = r6.zzu
            boolean r7 = r7.zzL()
            if (r7 != 0) goto L44
        L42:
            r4 = 0
        L43:
            return r4
        L44:
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzf()
            r7.zza(r3)
            return r5
        L50:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L74
            boolean r8 = r6.zzax(r7)
            if (r8 != 0) goto L92
            com.google.android.gms.measurement.internal.zzio r8 = r6.zzu
            boolean r8 = r8.zzL()
            if (r8 == 0) goto L73
            com.google.android.gms.measurement.internal.zzhe r8 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzf()
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzhe.zzn(r7)
            r8.zzb(r2, r7)
        L73:
            return r5
        L74:
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L93
            boolean r7 = r6.zzax(r8)
            if (r7 != 0) goto L92
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzf()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.zzhe.zzn(r8)
            java.lang.String r0 = "Invalid admob_app_id. Analytics disabled."
            r7.zzb(r0, r8)
            return r5
        L92:
            return r4
        L93:
            com.google.android.gms.measurement.internal.zzio r7 = r6.zzu
            boolean r7 = r7.zzL()
            if (r7 == 0) goto La6
            com.google.android.gms.measurement.internal.zzhe r7 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzf()
            r7.zza(r3)
        La6:
            return r5
    }

    final boolean zzad(java.lang.String r4, int r5, java.lang.String r6) {
            r3 = this;
            r0 = 0
            if (r6 != 0) goto L13
            com.google.android.gms.measurement.internal.zzio r5 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zzf()
            java.lang.String r6 = "Name is required and can't be null. Type"
            r5.zzb(r6, r4)
            return r0
        L13:
            int r1 = r6.length()
            int r1 = r6.codePointCount(r0, r1)
            if (r1 <= r5) goto L31
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzf()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r2 = "Name is too long. Type, maximum supported length, name"
            r1.zzd(r2, r4, r5, r6)
            return r0
        L31:
            r4 = 1
            return r4
    }

    final boolean zzae(java.lang.String r5, java.lang.String[] r6, java.lang.String[] r7, java.lang.String r8) {
            r4 = this;
            r0 = 0
            if (r8 != 0) goto L13
            com.google.android.gms.measurement.internal.zzio r6 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzf()
            java.lang.String r7 = "Name is required and can't be null. Type"
            r6.zzb(r7, r5)
            return r0
        L13:
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.zzqf.zzb
            r2 = 0
        L19:
            r3 = 3
            if (r2 >= r3) goto L37
            r3 = r1[r2]
            boolean r3 = r8.startsWith(r3)
            if (r3 == 0) goto L34
            com.google.android.gms.measurement.internal.zzio r6 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzf()
            java.lang.String r7 = "Name starts with reserved prefix. Type, name"
            r6.zzc(r7, r5, r8)
            return r0
        L34:
            int r2 = r2 + 1
            goto L19
        L37:
            if (r6 == 0) goto L57
            boolean r6 = zzaC(r8, r6)
            if (r6 == 0) goto L57
            if (r7 == 0) goto L47
            boolean r6 = zzaC(r8, r7)
            if (r6 != 0) goto L57
        L47:
            com.google.android.gms.measurement.internal.zzio r6 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzf()
            java.lang.String r7 = "Name is reserved. Type, name"
            r6.zzc(r7, r5, r8)
            return r0
        L57:
            r5 = 1
            return r5
    }

    final boolean zzaf(java.lang.String r4, java.lang.String r5, int r6, java.lang.Object r7) {
            r3 = this;
            r0 = 1
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.lang.Long
            if (r1 != 0) goto L56
            boolean r1 = r7 instanceof java.lang.Float
            if (r1 != 0) goto L56
            boolean r1 = r7 instanceof java.lang.Integer
            if (r1 != 0) goto L56
            boolean r1 = r7 instanceof java.lang.Byte
            if (r1 != 0) goto L56
            boolean r1 = r7 instanceof java.lang.Short
            if (r1 != 0) goto L56
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 != 0) goto L56
            boolean r1 = r7 instanceof java.lang.Double
            if (r1 == 0) goto L21
            goto L56
        L21:
            boolean r1 = r7 instanceof java.lang.String
            r2 = 0
            if (r1 != 0) goto L30
            boolean r1 = r7 instanceof java.lang.Character
            if (r1 != 0) goto L30
            boolean r1 = r7 instanceof java.lang.CharSequence
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            return r2
        L30:
            java.lang.String r7 = r7.toString()
            int r1 = r7.length()
            int r1 = r7.codePointCount(r2, r1)
            if (r1 <= r6) goto L56
            com.google.android.gms.measurement.internal.zzio r6 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzl()
            int r7 = r7.length()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r0 = "Value is too long; discarded. Value kind, name, value length"
            r6.zzd(r0, r4, r5, r7)
            return r2
        L56:
            return r0
    }

    final boolean zzag(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            r0 = 0
            if (r8 != 0) goto L13
            com.google.android.gms.measurement.internal.zzio r8 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzf()
            java.lang.String r1 = "Name is required and can't be null. Type"
            r8.zzb(r1, r7)
            return r0
        L13:
            int r1 = r8.length()
            if (r1 != 0) goto L29
            com.google.android.gms.measurement.internal.zzio r8 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r8 = r8.zzaW()
            com.google.android.gms.measurement.internal.zzhc r8 = r8.zzf()
            java.lang.String r1 = "Name is required and can't be empty. Type"
            r8.zzb(r1, r7)
            return r0
        L29:
            int r1 = r8.codePointAt(r0)
            boolean r2 = java.lang.Character.isLetter(r1)
            r3 = 95
            if (r2 != 0) goto L4a
            if (r1 != r3) goto L3a
            r1 = 95
            goto L4a
        L3a:
            com.google.android.gms.measurement.internal.zzio r1 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzf()
            java.lang.String r2 = "Name must start with a letter or _ (underscore). Type, name"
            r1.zzc(r2, r7, r8)
            return r0
        L4a:
            int r2 = r8.length()
            int r1 = java.lang.Character.charCount(r1)
        L52:
            if (r1 >= r2) goto L77
            int r4 = r8.codePointAt(r1)
            if (r4 == r3) goto L71
            boolean r5 = java.lang.Character.isLetterOrDigit(r4)
            if (r5 == 0) goto L61
            goto L71
        L61:
            com.google.android.gms.measurement.internal.zzio r1 = r6.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzf()
            java.lang.String r2 = "Name must consist of letters, digits or _ (underscores). Type, name"
            r1.zzc(r2, r7, r8)
            return r0
        L71:
            int r4 = java.lang.Character.charCount(r4)
            int r1 = r1 + r4
            goto L52
        L77:
            r7 = 1
            return r7
    }

    final boolean zzah(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L13
            com.google.android.gms.measurement.internal.zzio r7 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzf()
            java.lang.String r1 = "Name is required and can't be null. Type"
            r7.zzb(r1, r6)
            return r0
        L13:
            int r1 = r7.length()
            if (r1 != 0) goto L29
            com.google.android.gms.measurement.internal.zzio r7 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r7 = r7.zzaW()
            com.google.android.gms.measurement.internal.zzhc r7 = r7.zzf()
            java.lang.String r1 = "Name is required and can't be empty. Type"
            r7.zzb(r1, r6)
            return r0
        L29:
            int r1 = r7.codePointAt(r0)
            boolean r2 = java.lang.Character.isLetter(r1)
            if (r2 != 0) goto L43
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzf()
            java.lang.String r2 = "Name must start with a letter. Type, name"
            r1.zzc(r2, r6, r7)
            return r0
        L43:
            int r2 = r7.length()
            int r1 = java.lang.Character.charCount(r1)
        L4b:
            if (r1 >= r2) goto L72
            int r3 = r7.codePointAt(r1)
            r4 = 95
            if (r3 == r4) goto L6c
            boolean r4 = java.lang.Character.isLetterOrDigit(r3)
            if (r4 == 0) goto L5c
            goto L6c
        L5c:
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzf()
            java.lang.String r2 = "Name must consist of letters, digits or _ (underscores). Type, name"
            r1.zzc(r2, r6, r7)
            return r0
        L6c:
            int r3 = java.lang.Character.charCount(r3)
            int r1 = r1 + r3
            goto L4b
        L72:
            r6 = 1
            return r6
    }

    @android.annotation.TargetApi(30)
    final boolean zzai() {
            r5 = this;
            java.lang.Boolean r0 = r5.zzh
            if (r0 != 0) goto L5f
            androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures r0 = r5.zzB()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            com.google.common.util.concurrent.ListenableFuture r0 = r0.getMeasurementApiStatusAsync()
            r2 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L34 java.lang.InterruptedException -> L36 java.util.concurrent.ExecutionException -> L38 java.util.concurrent.CancellationException -> L3a
            java.lang.Object r0 = r0.get(r2, r4)     // Catch: java.util.concurrent.TimeoutException -> L34 java.lang.InterruptedException -> L36 java.util.concurrent.ExecutionException -> L38 java.util.concurrent.CancellationException -> L3a
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.util.concurrent.TimeoutException -> L34 java.lang.InterruptedException -> L36 java.util.concurrent.ExecutionException -> L38 java.util.concurrent.CancellationException -> L3a
            r2 = 1
            if (r0 == 0) goto L2d
            int r3 = r0.intValue()     // Catch: java.util.concurrent.TimeoutException -> L25 java.lang.InterruptedException -> L27 java.util.concurrent.ExecutionException -> L29 java.util.concurrent.CancellationException -> L2b
            if (r3 != r2) goto L2d
            r1 = 1
            goto L2d
        L25:
            r1 = move-exception
            goto L3d
        L27:
            r1 = move-exception
            goto L3d
        L29:
            r1 = move-exception
            goto L3d
        L2b:
            r1 = move-exception
            goto L3d
        L2d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.util.concurrent.TimeoutException -> L25 java.lang.InterruptedException -> L27 java.util.concurrent.ExecutionException -> L29 java.util.concurrent.CancellationException -> L2b
            r5.zzh = r1     // Catch: java.util.concurrent.TimeoutException -> L25 java.lang.InterruptedException -> L27 java.util.concurrent.ExecutionException -> L29 java.util.concurrent.CancellationException -> L2b
            goto L50
        L34:
            r0 = move-exception
            goto L3b
        L36:
            r0 = move-exception
            goto L3b
        L38:
            r0 = move-exception
            goto L3b
        L3a:
            r0 = move-exception
        L3b:
            r1 = r0
            r0 = 0
        L3d:
            com.google.android.gms.measurement.internal.zzio r2 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r2 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r2 = r2.zzk()
            java.lang.String r3 = "Measurement manager api exception"
            r2.zzb(r3, r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.zzh = r1
        L50:
            com.google.android.gms.measurement.internal.zzio r1 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r1 = r1.zzaW()
            com.google.android.gms.measurement.internal.zzhc r1 = r1.zzj()
            java.lang.String r2 = "Measurement manager api status result"
            r1.zzb(r2, r0)
        L5f:
            java.lang.Boolean r0 = r5.zzh
            boolean r0 = r0.booleanValue()
            return r0
    }

    final boolean zzaj(java.lang.String r3) {
            r2 = this;
            r2.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            android.content.Context r1 = r0.zzaT()
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r1)
            int r1 = r1.checkCallingOrSelfPermission(r3)
            if (r1 != 0) goto L15
            r3 = 1
            return r3
        L15:
            com.google.android.gms.measurement.internal.zzhe r0 = r0.zzaW()
            com.google.android.gms.measurement.internal.zzhc r0 = r0.zzd()
            java.lang.String r1 = "Permission not granted"
            r0.zzb(r1, r3)
            r3 = 0
            return r3
    }

    final boolean zzak(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L8
            r2 = 1
            return r2
        L8:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L10
            r2 = 0
            return r2
        L10:
            com.google.android.gms.measurement.internal.zzio r3 = r1.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r3.zzf()
            java.lang.String r0 = r0.zzo()
            r3.zzaV()
            boolean r2 = r0.equals(r2)
            return r2
    }

    final boolean zzal(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.os.Parcelable[]
            if (r0 != 0) goto Lf
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto Lf
            boolean r2 = r2 instanceof android.os.Bundle
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    final boolean zzam(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            javax.security.auth.x500.X500Principal r0 = new javax.security.auth.x500.X500Principal
            java.lang.String r1 = "CN=Android Debug,O=Android,C=US"
            r0.<init>(r1)
            com.google.android.gms.common.wrappers.PackageManagerWrapper r3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            r1 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            if (r3 == 0) goto L5c
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            if (r3 == 0) goto L5c
            int r4 = r3.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            if (r4 <= 0) goto L5c
            r4 = 0
            r3 = r3[r4]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            byte[] r3 = r3.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            r1.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            java.security.cert.Certificate r3 = r4.generateCertificate(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            javax.security.auth.x500.X500Principal r3 = r3.getSubjectX500Principal()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            boolean r3 = r3.equals(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b java.security.cert.CertificateException -> L4c
            return r3
        L3b:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.String r0 = "Package name not found"
            r4.zzb(r0, r3)
            goto L5c
        L4c:
            r3 = move-exception
            com.google.android.gms.measurement.internal.zzio r4 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zze()
            java.lang.String r0 = "Error obtaining certificate"
            r4.zzb(r0, r3)
        L5c:
            r3 = 1
            return r3
    }

    final boolean zzan() {
            r5 = this;
            r5.zzg()
            long r0 = r5.zzq()
            r2 = 1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final boolean zzao(int r4, boolean r5) {
            r3 = this;
            com.google.android.gms.measurement.internal.zzio r5 = r3.zzu
            com.google.android.gms.measurement.internal.zzny r5 = r5.zzu()
            java.lang.Boolean r5 = r5.zzl()
            int r0 = r3.zzm()
            int r4 = r4 / 1000
            r1 = 0
            r2 = 1
            if (r0 >= r4) goto L1e
            if (r5 == 0) goto L1f
            boolean r4 = r5.booleanValue()
            if (r4 != 0) goto L1d
            goto L1e
        L1d:
            return r1
        L1e:
            r1 = 1
        L1f:
            return r1
    }

    final boolean zzav(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r2 = 0
            if (r0 != 0) goto L18
            if (r1 != 0) goto L18
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L18
            r4 = 1
            return r4
        L18:
            return r2
    }

    final boolean zzaw(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r4.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzbp
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            if (r0 == 0) goto L14
            boolean r5 = r4.zzav(r5, r6)
            return r5
        L14:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L2d
            if (r1 != 0) goto L2d
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L2c
            return r2
        L2c:
            return r3
        L2d:
            if (r0 == 0) goto L4d
            if (r1 == 0) goto L4d
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L45
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L45
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L44
            return r2
        L44:
            return r3
        L45:
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L4c
            return r2
        L4c:
            return r3
        L4d:
            if (r0 != 0) goto L65
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 == 0) goto L56
            return r3
        L56:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L64
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L63
            goto L64
        L63:
            return r3
        L64:
            return r2
        L65:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L73
            boolean r5 = r7.equals(r8)
            if (r5 != 0) goto L72
            goto L73
        L72:
            return r3
        L73:
            return r2
    }

    final boolean zzax(java.lang.String r4) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.measurement.internal.zzio r0 = r3.zzu
            com.google.android.gms.measurement.internal.zzam r0 = r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r1 = com.google.android.gms.measurement.internal.zzgi.zzbp
            r2 = 0
            boolean r0 = r0.zzx(r2, r1)
            r1 = 1
            if (r1 == r0) goto L16
            java.lang.String r0 = "xGN4Vue"
            goto L18
        L16:
            java.lang.String r0 = "^1:\\d+:android:[a-f0-9]+$"
        L18:
            boolean r4 = r4.matches(r0)
            return r4
    }

    final byte[] zzay(android.os.Parcelable r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r3.writeToParcel(r0, r1)     // Catch: java.lang.Throwable -> L14
            byte[] r3 = r0.marshall()     // Catch: java.lang.Throwable -> L14
            r0.recycle()
            return r3
        L14:
            r3 = move-exception
            r0.recycle()
            throw r3
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    protected final boolean zzc() {
            r1 = this;
            r0 = 1
            return r0
    }

    final int zzd(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            java.lang.String r0 = "_ldl"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L13
            int r0 = r2.zzaA(r3)
            java.lang.String r1 = "user property referrer"
            boolean r3 = r2.zzaf(r1, r3, r0, r4)
            goto L1d
        L13:
            int r0 = r2.zzaA(r3)
            java.lang.String r1 = "user property"
            boolean r3 = r2.zzaf(r1, r3, r0, r4)
        L1d:
            if (r3 == 0) goto L21
            r3 = 0
            return r3
        L21:
            r3 = 7
            return r3
    }

    final int zzf(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "event"
            boolean r1 = r4.zzag(r0, r5)
            r2 = 2
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.zzjy.zza
            java.lang.String[] r3 = com.google.android.gms.measurement.internal.zzjy.zzb
            boolean r1 = r4.zzae(r0, r1, r3, r5)
            if (r1 != 0) goto L17
            r5 = 13
            return r5
        L17:
            com.google.android.gms.measurement.internal.zzio r1 = r4.zzu
            r1.zzf()
            r1 = 40
            boolean r5 = r4.zzad(r0, r1, r5)
            if (r5 != 0) goto L25
            return r2
        L25:
            r5 = 0
            return r5
    }

    final int zzh(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "event param"
            boolean r1 = r3.zzag(r0, r4)
            r2 = 3
            if (r1 != 0) goto La
            return r2
        La:
            r1 = 0
            boolean r1 = r3.zzae(r0, r1, r1, r4)
            if (r1 != 0) goto L14
            r4 = 14
            return r4
        L14:
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            r1.zzf()
            r1 = 40
            boolean r4 = r3.zzad(r0, r1, r4)
            if (r4 != 0) goto L22
            return r2
        L22:
            r4 = 0
            return r4
    }

    final int zzi(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "event param"
            boolean r1 = r3.zzah(r0, r4)
            r2 = 3
            if (r1 != 0) goto La
            return r2
        La:
            r1 = 0
            boolean r1 = r3.zzae(r0, r1, r1, r4)
            if (r1 != 0) goto L14
            r4 = 14
            return r4
        L14:
            com.google.android.gms.measurement.internal.zzio r1 = r3.zzu
            r1.zzf()
            r1 = 40
            boolean r4 = r3.zzad(r0, r1, r4)
            if (r4 != 0) goto L22
            return r2
        L22:
            r4 = 0
            return r4
    }

    final int zzj(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "user property"
            boolean r1 = r4.zzag(r0, r5)
            r2 = 6
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String[] r1 = com.google.android.gms.measurement.internal.zzka.zza
            r3 = 0
            boolean r1 = r4.zzae(r0, r1, r3, r5)
            if (r1 != 0) goto L16
            r5 = 15
            return r5
        L16:
            com.google.android.gms.measurement.internal.zzio r1 = r4.zzu
            r1.zzf()
            r1 = 24
            boolean r5 = r4.zzad(r0, r1, r5)
            if (r5 != 0) goto L24
            return r2
        L24:
            r5 = 0
            return r5
    }

    final int zzl() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L15
            int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r1)
            r1 = 3
            if (r0 <= r1) goto L15
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r0)
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final int zzm() {
            r2 = this;
            java.lang.Integer r0 = r2.zzi
            if (r0 != 0) goto L1a
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.common.GoogleApiAvailabilityLight r1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            android.content.Context r0 = r0.zzaT()
            int r0 = r1.getApkVersion(r0)
            int r0 = r0 / 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.zzi = r0
        L1a:
            java.lang.Integer r0 = r2.zzi
            int r0 = r0.intValue()
            return r0
    }

    public final int zzp(int r3) {
            r2 = this;
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu
            com.google.android.gms.common.GoogleApiAvailabilityLight r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance()
            android.content.Context r3 = r3.zzaT()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r3 = r0.isGooglePlayServicesAvailable(r3, r1)
            return r3
    }

    final long zzq() {
            r7 = this;
            r7.zzg()
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            com.google.android.gms.measurement.internal.zzgs r0 = r0.zzh()
            java.lang.String r0 = r0.zzm()
            boolean r0 = r7.zzab(r0)
            r1 = 0
            if (r0 != 0) goto L16
            return r1
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 >= r3) goto L1f
            r3 = 4
            goto L45
        L1f:
            int r0 = android.os.ext.SdkExtensions.getExtensionVersion(r3)
            r3 = 4
            if (r0 >= r3) goto L29
            r3 = 8
            goto L45
        L29:
            com.google.android.gms.measurement.internal.zzio r0 = r7.zzu
            int r3 = r7.zzl()
            r0.zzf()
            com.google.android.gms.measurement.internal.zzgg r0 = com.google.android.gms.measurement.internal.zzgi.zzak
            r4 = 0
            java.lang.Object r0 = r0.zza(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r3 >= r0) goto L44
            r3 = 16
            goto L45
        L44:
            r3 = r1
        L45:
            java.lang.String r0 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r0 = r7.zzaj(r0)
            if (r0 != 0) goto L50
            r5 = 2
            long r3 = r3 | r5
        L50:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L5c
            boolean r0 = r7.zzai()
            if (r0 != 0) goto L5c
            r3 = 64
        L5c:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L63
            r0 = 1
            return r0
        L63:
            return r3
    }

    public final long zzs() {
            r6 = this;
            java.util.concurrent.atomic.AtomicLong r0 = r6.zze
            long r1 = r0.get()
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L32
            monitor-enter(r0)
            java.util.Random r1 = new java.util.Random     // Catch: java.lang.Throwable -> L2f
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.measurement.internal.zzio r4 = r6.zzu     // Catch: java.lang.Throwable -> L2f
            com.google.android.gms.common.util.Clock r4 = r4.zzaU()     // Catch: java.lang.Throwable -> L2f
            long r4 = r4.currentTimeMillis()     // Catch: java.lang.Throwable -> L2f
            long r2 = r2 ^ r4
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f
            long r1 = r1.nextLong()     // Catch: java.lang.Throwable -> L2f
            int r3 = r6.zzf     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            r6.zzf = r3     // Catch: java.lang.Throwable -> L2f
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2f
            long r1 = r1 + r3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r1
        L2f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r1
        L32:
            java.util.concurrent.atomic.AtomicLong r0 = r6.zze
            monitor-enter(r0)
            r1 = -1
            r3 = 1
            r0.compareAndSet(r1, r3)     // Catch: java.lang.Throwable -> L42
            long r1 = r0.getAndIncrement()     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            return r1
        L42:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            throw r1
    }

    public final long zzt(long r3, long r5) {
            r2 = this;
            r0 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 * r0
            long r3 = r3 + r5
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r3 = r3 / r5
            return r3
    }

    final android.os.Bundle zzu(android.net.Uri r18) {
            r17 = this;
            r0 = r18
            r1 = 0
            if (r0 == 0) goto L18d
            boolean r2 = r18.isHierarchical()     // Catch: java.lang.UnsupportedOperationException -> L17a
            java.lang.String r3 = "sfmc_id"
            java.lang.String r4 = "srsltid"
            java.lang.String r5 = "dclid"
            java.lang.String r6 = "gbraid"
            java.lang.String r7 = "gclid"
            if (r2 == 0) goto L42
            java.lang.String r2 = "utm_campaign"
            java.lang.String r2 = r0.getQueryParameter(r2)     // Catch: java.lang.UnsupportedOperationException -> L17a
            java.lang.String r8 = "utm_source"
            java.lang.String r8 = r0.getQueryParameter(r8)     // Catch: java.lang.UnsupportedOperationException -> L17a
            java.lang.String r9 = "utm_medium"
            java.lang.String r9 = r0.getQueryParameter(r9)     // Catch: java.lang.UnsupportedOperationException -> L17a
            java.lang.String r10 = r0.getQueryParameter(r7)     // Catch: java.lang.UnsupportedOperationException -> L17a
            java.lang.String r11 = r0.getQueryParameter(r6)     // Catch: java.lang.UnsupportedOperationException -> L17a
            java.lang.String r12 = "utm_id"
            java.lang.String r12 = r0.getQueryParameter(r12)     // Catch: java.lang.UnsupportedOperationException -> L17a
            java.lang.String r13 = r0.getQueryParameter(r5)     // Catch: java.lang.UnsupportedOperationException -> L17a
            java.lang.String r14 = r0.getQueryParameter(r4)     // Catch: java.lang.UnsupportedOperationException -> L17a
            java.lang.String r15 = r0.getQueryParameter(r3)     // Catch: java.lang.UnsupportedOperationException -> L17a
            goto L4b
        L42:
            r2 = r1
            r8 = r2
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
        L4b:
            boolean r16 = android.text.TextUtils.isEmpty(r2)
            if (r16 == 0) goto L83
            boolean r16 = android.text.TextUtils.isEmpty(r8)
            if (r16 == 0) goto L83
            boolean r16 = android.text.TextUtils.isEmpty(r9)
            if (r16 == 0) goto L83
            boolean r16 = android.text.TextUtils.isEmpty(r10)
            if (r16 == 0) goto L83
            boolean r16 = android.text.TextUtils.isEmpty(r11)
            if (r16 == 0) goto L83
            boolean r16 = android.text.TextUtils.isEmpty(r12)
            if (r16 == 0) goto L83
            boolean r16 = android.text.TextUtils.isEmpty(r13)
            if (r16 == 0) goto L83
            boolean r16 = android.text.TextUtils.isEmpty(r14)
            if (r16 == 0) goto L83
            boolean r16 = android.text.TextUtils.isEmpty(r15)
            if (r16 != 0) goto L82
            goto L83
        L82:
            return r1
        L83:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            boolean r16 = android.text.TextUtils.isEmpty(r2)
            if (r16 != 0) goto L96
            r16 = r3
            java.lang.String r3 = "campaign"
            r1.putString(r3, r2)
            goto L98
        L96:
            r16 = r3
        L98:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto La3
            java.lang.String r2 = "source"
            r1.putString(r2, r8)
        La3:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "medium"
            r1.putString(r2, r9)
        Lae:
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto Lb7
            r1.putString(r7, r10)
        Lb7:
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 != 0) goto Lc0
            r1.putString(r6, r11)
        Lc0:
            java.lang.String r2 = "gad_source"
            java.lang.String r3 = r0.getQueryParameter(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto Lcf
            r1.putString(r2, r3)
        Lcf:
            java.lang.String r2 = "utm_term"
            java.lang.String r2 = r0.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Le0
            java.lang.String r3 = "term"
            r1.putString(r3, r2)
        Le0:
            java.lang.String r2 = "utm_content"
            java.lang.String r2 = r0.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Lf1
            java.lang.String r3 = "content"
            r1.putString(r3, r2)
        Lf1:
            java.lang.String r2 = "aclid"
            java.lang.String r3 = r0.getQueryParameter(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L100
            r1.putString(r2, r3)
        L100:
            java.lang.String r2 = "cp1"
            java.lang.String r3 = r0.getQueryParameter(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L10f
            r1.putString(r2, r3)
        L10f:
            java.lang.String r2 = "anid"
            java.lang.String r3 = r0.getQueryParameter(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L11e
            r1.putString(r2, r3)
        L11e:
            boolean r2 = android.text.TextUtils.isEmpty(r12)
            if (r2 != 0) goto L129
            java.lang.String r2 = "campaign_id"
            r1.putString(r2, r12)
        L129:
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 != 0) goto L132
            r1.putString(r5, r13)
        L132:
            java.lang.String r2 = "utm_source_platform"
            java.lang.String r2 = r0.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L143
            java.lang.String r3 = "source_platform"
            r1.putString(r3, r2)
        L143:
            java.lang.String r2 = "utm_creative_format"
            java.lang.String r2 = r0.getQueryParameter(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L154
            java.lang.String r3 = "creative_format"
            r1.putString(r3, r2)
        L154:
            java.lang.String r2 = "utm_marketing_tactic"
            java.lang.String r0 = r0.getQueryParameter(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L165
            java.lang.String r2 = "marketing_tactic"
            r1.putString(r2, r0)
        L165:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L16e
            r1.putString(r4, r14)
        L16e:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L179
            r0 = r16
            r1.putString(r0, r15)
        L179:
            return r1
        L17a:
            r0 = move-exception
            r2 = r17
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzk()
            java.lang.String r4 = "Install referrer url isn't a hierarchical URI"
            r3.zzb(r4, r0)
            return r1
        L18d:
            r2 = r17
            return r1
    }

    final android.os.Bundle zzz(android.os.Bundle r5, java.lang.String r6) {
            r4 = this;
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            if (r5 == 0) goto L41
            java.util.Set r0 = r5.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r5.get(r1)
            java.lang.Object r2 = r4.zzD(r1, r2)
            if (r2 != 0) goto L3d
            com.google.android.gms.measurement.internal.zzio r2 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r2.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zzl()
            com.google.android.gms.measurement.internal.zzgx r2 = r2.zzj()
            java.lang.String r1 = r2.zze(r1)
            java.lang.String r2 = "Param value can't be null"
            r3.zzb(r2, r1)
            goto Lf
        L3d:
            r4.zzS(r6, r1, r2)
            goto Lf
        L41:
            return r6
    }
}

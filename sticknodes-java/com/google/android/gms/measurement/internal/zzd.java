package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzd extends com.google.android.gms.measurement.internal.zzf {
    private final java.util.Map zza;
    private final java.util.Map zzb;
    private long zzc;

    public zzd(com.google.android.gms.measurement.internal.zzio r1) {
            r0 = this;
            r0.<init>(r1)
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            r0.zzb = r1
            androidx.collection.ArrayMap r1 = new androidx.collection.ArrayMap
            r1.<init>()
            r0.zza = r1
            return
    }

    static /* synthetic */ void zza(com.google.android.gms.measurement.internal.zzd r4, java.lang.String r5, long r6) {
            r4.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r5)
            java.util.Map r0 = r4.zzb
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L10
            r4.zzc = r6
        L10:
            java.lang.Object r1 = r0.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 1
            if (r1 == 0) goto L26
            int r4 = r1.intValue()
            int r4 = r4 + r2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r5, r4)
            return
        L26:
            int r1 = r0.size()
            r3 = 100
            if (r1 < r3) goto L3e
            com.google.android.gms.measurement.internal.zzio r4 = r4.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzk()
            java.lang.String r5 = "Too many ads visible"
            r4.zza(r5)
            return
        L3e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r5, r1)
            java.util.Map r4 = r4.zza
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r4.put(r5, r6)
            return
    }

    static /* synthetic */ void zzb(com.google.android.gms.measurement.internal.zzd r5, java.lang.String r6, long r7) {
            r5.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)
            java.util.Map r0 = r5.zzb
            java.lang.Object r1 = r0.get(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L79
            com.google.android.gms.measurement.internal.zzio r2 = r5.zzu
            com.google.android.gms.measurement.internal.zzmo r2 = r2.zzt()
            r3 = 0
            com.google.android.gms.measurement.internal.zzmh r2 = r2.zzj(r3)
            int r1 = r1.intValue()
            int r1 = r1 + (-1)
            if (r1 != 0) goto L71
            r0.remove(r6)
            java.util.Map r1 = r5.zza
            java.lang.Object r3 = r1.get(r6)
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto L40
            com.google.android.gms.measurement.internal.zzio r6 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zze()
            java.lang.String r1 = "First ad unit exposure time was never set"
            r6.zza(r1)
            goto L4c
        L40:
            long r3 = r3.longValue()
            long r3 = r7 - r3
            r1.remove(r6)
            r5.zzi(r6, r3, r2)
        L4c:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L70
            long r0 = r5.zzc
            r3 = 0
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 != 0) goto L6a
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()
            java.lang.String r6 = "First ad exposure time was never set"
            r5.zza(r6)
            return
        L6a:
            long r7 = r7 - r0
            r5.zzh(r7, r2)
            r5.zzc = r3
        L70:
            return
        L71:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0.put(r6, r5)
            return
        L79:
            com.google.android.gms.measurement.internal.zzio r5 = r5.zzu
            com.google.android.gms.measurement.internal.zzhe r5 = r5.zzaW()
            com.google.android.gms.measurement.internal.zzhc r5 = r5.zze()
            java.lang.String r7 = "Call to endAdUnitExposure for unknown ad unit id"
            r5.zzb(r7, r6)
            return
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.measurement.internal.zzd r0, long r1) {
            r0.zzj(r1)
            return
    }

    private final void zzh(long r4, com.google.android.gms.measurement.internal.zzmh r6) {
            r3 = this;
            if (r6 != 0) goto L12
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()
            java.lang.String r5 = "Not logging ad exposure. No active activity"
            r4.zza(r5)
            return
        L12:
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2c
            com.google.android.gms.measurement.internal.zzio r6 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r6 = r6.zzaW()
            com.google.android.gms.measurement.internal.zzhc r6 = r6.zzj()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "Not logging ad exposure. Less than 1000 ms. exposure"
            r6.zzb(r5, r4)
            return
        L2c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "_xt"
            r0.putLong(r1, r4)
            r4 = 1
            com.google.android.gms.measurement.internal.zzqf.zzN(r6, r0, r4)
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzlw r4 = r4.zzq()
            java.lang.String r5 = "am"
            java.lang.String r6 = "_xa"
            r4.zzR(r5, r6, r0)
            return
    }

    private final void zzi(java.lang.String r4, long r5, com.google.android.gms.measurement.internal.zzmh r7) {
            r3 = this;
            if (r7 != 0) goto L12
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()
            java.lang.String r5 = "Not logging ad unit exposure. No active activity"
            r4.zza(r5)
            return
        L12:
            r0 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L2c
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzhe r4 = r4.zzaW()
            com.google.android.gms.measurement.internal.zzhc r4 = r4.zzj()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "Not logging ad unit exposure. Less than 1000 ms. exposure"
            r4.zzb(r6, r5)
            return
        L2c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "_ai"
            r0.putString(r1, r4)
            java.lang.String r4 = "_xt"
            r0.putLong(r4, r5)
            r4 = 1
            com.google.android.gms.measurement.internal.zzqf.zzN(r7, r0, r4)
            com.google.android.gms.measurement.internal.zzio r4 = r3.zzu
            com.google.android.gms.measurement.internal.zzlw r4 = r4.zzq()
            java.lang.String r5 = "am"
            java.lang.String r6 = "_xu"
            r4.zzR(r5, r6, r0)
            return
    }

    private final void zzj(long r5) {
            r4 = this;
            java.util.Map r0 = r4.zza
            java.util.Set r1 = r0.keySet()
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0.put(r2, r3)
            goto La
        L1e:
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            r4.zzc = r5
        L26:
            return
    }

    public final void zzd(java.lang.String r3, long r4) {
            r2 = this;
            if (r3 == 0) goto L18
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L18
        L9:
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zza r1 = new com.google.android.gms.measurement.internal.zza
            r1.<init>(r2, r3, r4)
            r0.zzq(r1)
            return
        L18:
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r4 = "Ad unit id must be a non-empty string"
            r3.zza(r4)
            return
    }

    public final void zze(java.lang.String r3, long r4) {
            r2 = this;
            if (r3 == 0) goto L18
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L18
        L9:
            com.google.android.gms.measurement.internal.zzio r0 = r2.zzu
            com.google.android.gms.measurement.internal.zzil r0 = r0.zzaX()
            com.google.android.gms.measurement.internal.zzb r1 = new com.google.android.gms.measurement.internal.zzb
            r1.<init>(r2, r3, r4)
            r0.zzq(r1)
            return
        L18:
            com.google.android.gms.measurement.internal.zzio r3 = r2.zzu
            com.google.android.gms.measurement.internal.zzhe r3 = r3.zzaW()
            com.google.android.gms.measurement.internal.zzhc r3 = r3.zze()
            java.lang.String r4 = "Ad unit id must be a non-empty string"
            r3.zza(r4)
            return
    }

    public final void zzf(long r7) {
            r6 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r6.zzu
            com.google.android.gms.measurement.internal.zzmo r0 = r0.zzt()
            r1 = 0
            com.google.android.gms.measurement.internal.zzmh r0 = r0.zzj(r1)
            java.util.Map r1 = r6.zza
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            long r4 = r7 - r4
            r6.zzi(r3, r4, r0)
            goto L15
        L31:
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L3e
            long r1 = r6.zzc
            long r1 = r7 - r1
            r6.zzh(r1, r0)
        L3e:
            r6.zzj(r7)
            return
    }
}

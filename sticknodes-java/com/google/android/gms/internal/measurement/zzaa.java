package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzaa {
    private static final com.google.common.collect.ImmutableSet zza = null;
    private java.lang.String zzb;
    private final long zzc;
    private final java.util.Map zzd;

    static {
            java.lang.String r0 = "_syn"
            java.lang.String r1 = "_err"
            java.lang.String r2 = "_el"
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.of(r0, r1, r2)
            com.google.android.gms.internal.measurement.zzaa.zza = r0
            return
    }

    public zzaa(java.lang.String r1, long r2, java.util.Map r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.zzd = r1
            if (r4 == 0) goto L13
            r1.putAll(r4)
        L13:
            return
    }

    public static java.lang.Object zzd(java.lang.String r1, java.lang.Object r2, java.lang.Object r3) {
            com.google.common.collect.ImmutableSet r0 = com.google.android.gms.internal.measurement.zzaa.zza
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L1c
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 != 0) goto Ld
            goto L1c
        Ld:
            java.lang.Double r3 = (java.lang.Double) r3
            double r1 = r3.doubleValue()
            long r1 = java.lang.Math.round(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L1c:
            java.lang.String r0 = "_"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L2c
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L29
            goto L4c
        L29:
            if (r2 == 0) goto L4c
            return r2
        L2c:
            boolean r1 = r2 instanceof java.lang.Double
            if (r1 != 0) goto L4c
            boolean r1 = r2 instanceof java.lang.Long
            if (r1 == 0) goto L43
            java.lang.Double r3 = (java.lang.Double) r3
            double r1 = r3.doubleValue()
            long r1 = java.lang.Math.round(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L43:
            boolean r1 = r2 instanceof java.lang.String
            if (r1 == 0) goto L4c
            java.lang.String r1 = r3.toString()
            return r1
        L4c:
            return r3
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.google.android.gms.internal.measurement.zzaa r0 = r1.zzb()
            return r0
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L4
            r7 = 1
            return r7
        L4:
            boolean r0 = r7 instanceof com.google.android.gms.internal.measurement.zzaa
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            com.google.android.gms.internal.measurement.zzaa r7 = (com.google.android.gms.internal.measurement.zzaa) r7
            long r2 = r6.zzc
            long r4 = r7.zzc
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L15
            return r1
        L15:
            java.lang.String r0 = r6.zzb
            java.lang.String r2 = r7.zzb
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L20
            return r1
        L20:
            java.util.Map r0 = r6.zzd
            java.util.Map r7 = r7.zzd
            boolean r7 = r0.equals(r7)
            return r7
    }

    public final int hashCode() {
            r6 = this;
            java.lang.String r0 = r6.zzb
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r6.zzc
            java.util.Map r3 = r6.zzd
            r4 = 32
            long r4 = r1 >>> r4
            long r1 = r1 ^ r4
            int r2 = (int) r1
            int r0 = r0 + r2
            int r0 = r0 * 31
            int r1 = r3.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.zzb
            java.util.Map r1 = r5.zzd
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Event{name='"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "', timestamp="
            r2.append(r0)
            long r3 = r5.zzc
            r2.append(r3)
            java.lang.String r0 = ", params="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    public final com.google.android.gms.internal.measurement.zzaa zzb() {
            r5 = this;
            com.google.android.gms.internal.measurement.zzaa r0 = new com.google.android.gms.internal.measurement.zzaa
            java.lang.String r1 = r5.zzb
            java.util.HashMap r2 = new java.util.HashMap
            java.util.Map r3 = r5.zzd
            r2.<init>(r3)
            long r3 = r5.zzc
            r0.<init>(r1, r3, r2)
            return r0
    }

    public final java.lang.Object zzc(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.zzd
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto Ld
            java.lang.Object r3 = r0.get(r3)
            return r3
        Ld:
            r3 = 0
            return r3
    }

    public final java.lang.String zze() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final java.util.Map zzf() {
            r1 = this;
            java.util.Map r0 = r1.zzd
            return r0
    }

    public final void zzg(java.lang.String r1) {
            r0 = this;
            r0.zzb = r1
            return
    }

    public final void zzh(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L8
            java.util.Map r4 = r2.zzd
            r4.remove(r3)
            return
        L8:
            java.util.Map r0 = r2.zzd
            java.lang.Object r1 = r0.get(r3)
            java.lang.Object r4 = zzd(r3, r1, r4)
            r0.put(r3, r4)
            return
    }
}

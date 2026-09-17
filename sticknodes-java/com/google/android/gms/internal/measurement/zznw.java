package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* loaded from: classes2.dex */
final class zznw implements java.util.Map.Entry, java.lang.Comparable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzoa zza;
    private final java.lang.Comparable zzb;
    private java.lang.Object zzc;

    zznw(com.google.android.gms.internal.measurement.zzoa r1, java.lang.Comparable r2, java.lang.Object r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    private static final boolean zzb(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 == 0) goto L6
            r0 = 0
            goto Lc
        L6:
            r0 = 1
            return r0
        L8:
            boolean r0 = r0.equals(r1)
        Lc:
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zznw r2 = (com.google.android.gms.internal.measurement.zznw) r2
            java.lang.Comparable r2 = r2.zzb
            java.lang.Comparable r0 = r1.zzb
            int r2 = r0.compareTo(r2)
            return r2
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Comparable r1 = r4.zzb
            java.lang.Object r3 = r5.getKey()
            boolean r1 = zzb(r1, r3)
            if (r1 == 0) goto L25
            java.lang.Object r1 = r4.zzc
            java.lang.Object r5 = r5.getValue()
            boolean r5 = zzb(r1, r5)
            if (r5 == 0) goto L25
            return r0
        L25:
            return r2
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ java.lang.Object getKey() {
            r1 = this;
            java.lang.Comparable r0 = r1.zzb
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.lang.Object r0 = r1.zzc
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            java.lang.Comparable r0 = r3.zzb
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            java.lang.Object r2 = r3.zzc
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r1 = r2.hashCode()
        L14:
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.measurement.zzoa r0 = r1.zza
            com.google.android.gms.internal.measurement.zzoa.zzi(r0)
            java.lang.Object r0 = r1.zzc
            r1.zzc = r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.Comparable r0 = r3.zzb
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r1 = r3.zzc
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    public final java.lang.Comparable zza() {
            r1 = this;
            java.lang.Comparable r0 = r1.zzb
            return r0
    }
}

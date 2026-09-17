package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaim extends com.google.android.gms.internal.ads.zzaio {
    public final long zza;
    public final java.util.List zzb;
    public final java.util.List zzc;

    public zzaim(int r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzb = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzc = r1
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaio
    public final java.lang.String toString() {
            r4 = this;
            java.util.List r0 = r4.zzb
            int r1 = r4.zzd
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaio.zzf(r1)
            java.lang.Object[] r0 = r0.toArray()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.util.List r2 = r4.zzc
            java.lang.Object[] r2 = r2.toArray()
            java.lang.String r2 = java.util.Arrays.toString(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " leaves: "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " containers: "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaim zza(int r5) {
            r4 = this;
            java.util.List r0 = r4.zzc
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            java.util.List r2 = r4.zzc
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzaim r2 = (com.google.android.gms.internal.ads.zzaim) r2
            int r3 = r2.zzd
            if (r3 != r5) goto L16
            return r2
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r5 = 0
            return r5
    }

    public final com.google.android.gms.internal.ads.zzain zzb(int r5) {
            r4 = this;
            java.util.List r0 = r4.zzb
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            java.util.List r2 = r4.zzb
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.ads.zzain r2 = (com.google.android.gms.internal.ads.zzain) r2
            int r3 = r2.zzd
            if (r3 != r5) goto L16
            return r2
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            r5 = 0
            return r5
    }

    public final void zzc(com.google.android.gms.internal.ads.zzaim r2) {
            r1 = this;
            java.util.List r0 = r1.zzc
            r0.add(r2)
            return
    }

    public final void zzd(com.google.android.gms.internal.ads.zzain r2) {
            r1 = this;
            java.util.List r0 = r1.zzb
            r0.add(r2)
            return
    }
}

package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzwy {
    public static final com.google.android.gms.internal.ads.zzwy zza = null;
    public final int zzb;
    private final com.google.android.gms.internal.ads.zzgax zzc;
    private int zzd;

    static {
            com.google.android.gms.internal.ads.zzwy r0 = new com.google.android.gms.internal.ads.zzwy
            r1 = 0
            com.google.android.gms.internal.ads.zzcd[] r2 = new com.google.android.gms.internal.ads.zzcd[r1]
            r0.<init>(r2)
            com.google.android.gms.internal.ads.zzwy.zza = r0
            r0 = 36
            java.lang.Integer.toString(r1, r0)
            return
    }

    public zzwy(com.google.android.gms.internal.ads.zzcd... r6) {
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzm(r6)
            r5.zzc = r0
            int r6 = r6.length
            r5.zzb = r6
            r6 = 0
        Ld:
            com.google.android.gms.internal.ads.zzgax r0 = r5.zzc
            int r0 = r0.size()
            if (r6 >= r0) goto L47
            int r0 = r6 + 1
            r1 = r0
        L18:
            com.google.android.gms.internal.ads.zzgax r2 = r5.zzc
            int r2 = r2.size()
            if (r1 >= r2) goto L45
            com.google.android.gms.internal.ads.zzgax r2 = r5.zzc
            java.lang.Object r2 = r2.get(r6)
            com.google.android.gms.internal.ads.zzcd r2 = (com.google.android.gms.internal.ads.zzcd) r2
            com.google.android.gms.internal.ads.zzgax r3 = r5.zzc
            java.lang.Object r3 = r3.get(r1)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L42
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Multiple identical TrackGroups added to one TrackGroupArray."
            r2.<init>(r3)
            java.lang.String r3 = "TrackGroupArray"
            java.lang.String r4 = ""
            com.google.android.gms.internal.ads.zzea.zzd(r3, r4, r2)
        L42:
            int r1 = r1 + 1
            goto L18
        L45:
            r6 = r0
            goto Ld
        L47:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L23
            java.lang.Class<com.google.android.gms.internal.ads.zzwy> r2 = com.google.android.gms.internal.ads.zzwy.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L23
        L10:
            com.google.android.gms.internal.ads.zzwy r5 = (com.google.android.gms.internal.ads.zzwy) r5
            int r2 = r4.zzb
            int r3 = r5.zzb
            if (r2 != r3) goto L23
            com.google.android.gms.internal.ads.zzgax r2 = r4.zzc
            com.google.android.gms.internal.ads.zzgax r5 = r5.zzc
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L23
            return r0
        L23:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.zzd
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzc
            int r0 = r0.hashCode()
            r1.zzd = r0
        Lc:
            return r0
    }

    public final int zza(com.google.android.gms.internal.ads.zzcd r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzc
            int r2 = r0.indexOf(r2)
            if (r2 < 0) goto L9
            return r2
        L9:
            r2 = -1
            return r2
    }

    public final com.google.android.gms.internal.ads.zzcd zzb(int r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzgax r0 = r1.zzc
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.ads.zzcd r2 = (com.google.android.gms.internal.ads.zzcd) r2
            return r2
    }

    public final com.google.android.gms.internal.ads.zzgax zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzwx r0 = new com.google.android.gms.internal.ads.zzwx
            r0.<init>()
            com.google.android.gms.internal.ads.zzgax r1 = r2.zzc
            java.util.List r0 = com.google.android.gms.internal.ads.zzgbn.zzb(r1, r0)
            com.google.android.gms.internal.ads.zzgax r0 = com.google.android.gms.internal.ads.zzgax.zzl(r0)
            return r0
    }
}

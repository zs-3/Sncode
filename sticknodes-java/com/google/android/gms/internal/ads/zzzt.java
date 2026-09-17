package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzzt {
    private static final java.util.Comparator zza = null;
    private static final java.util.Comparator zzb = null;
    private final java.util.ArrayList zzc;
    private final com.google.android.gms.internal.ads.zzzs[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
            com.google.android.gms.internal.ads.zzzp r0 = new com.google.android.gms.internal.ads.zzzp
            r0.<init>()
            com.google.android.gms.internal.ads.zzzt.zza = r0
            com.google.android.gms.internal.ads.zzzq r0 = new com.google.android.gms.internal.ads.zzzq
            r0.<init>()
            com.google.android.gms.internal.ads.zzzt.zzb = r0
            return
    }

    public zzzt(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 5
            com.google.android.gms.internal.ads.zzzs[] r1 = new com.google.android.gms.internal.ads.zzzs[r1]
            r0.zzd = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zzc = r1
            r1 = -1
            r0.zze = r1
            return
    }

    public final float zza(float r6) {
            r5 = this;
            int r6 = r5.zze
            r0 = 0
            if (r6 == 0) goto Le
            java.util.ArrayList r6 = r5.zzc
            java.util.Comparator r1 = com.google.android.gms.internal.ads.zzzt.zzb
            java.util.Collections.sort(r6, r1)
            r5.zze = r0
        Le:
            int r6 = r5.zzg
            float r6 = (float) r6
            r1 = 0
        L12:
            java.util.ArrayList r2 = r5.zzc
            int r2 = r2.size()
            if (r0 >= r2) goto L34
            r2 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r6
            java.util.ArrayList r3 = r5.zzc
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.internal.ads.zzzs r3 = (com.google.android.gms.internal.ads.zzzs) r3
            int r4 = r3.zzb
            int r1 = r1 + r4
            float r4 = (float) r1
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L31
            float r6 = r3.zzc
            return r6
        L31:
            int r0 = r0 + 1
            goto L12
        L34:
            java.util.ArrayList r6 = r5.zzc
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L3f
            r6 = 2143289344(0x7fc00000, float:NaN)
            return r6
        L3f:
            java.util.ArrayList r6 = r5.zzc
            int r0 = r6.size()
            int r0 = r0 + (-1)
            java.lang.Object r6 = r6.get(r0)
            com.google.android.gms.internal.ads.zzzs r6 = (com.google.android.gms.internal.ads.zzzs) r6
            float r6 = r6.zzc
            return r6
    }

    public final void zzb(int r4, float r5) {
            r3 = this;
            int r0 = r3.zze
            r1 = 1
            if (r0 == r1) goto Le
            java.util.ArrayList r0 = r3.zzc
            java.util.Comparator r2 = com.google.android.gms.internal.ads.zzzt.zza
            java.util.Collections.sort(r0, r2)
            r3.zze = r1
        Le:
            int r0 = r3.zzh
            if (r0 <= 0) goto L1b
            com.google.android.gms.internal.ads.zzzs[] r1 = r3.zzd
            int r0 = r0 + (-1)
            r3.zzh = r0
            r0 = r1[r0]
            goto L21
        L1b:
            com.google.android.gms.internal.ads.zzzs r0 = new com.google.android.gms.internal.ads.zzzs
            r1 = 0
            r0.<init>(r1)
        L21:
            int r1 = r3.zzf
            int r2 = r1 + 1
            r3.zzf = r2
            r0.zza = r1
            r0.zzb = r4
            r0.zzc = r5
            java.util.ArrayList r5 = r3.zzc
            r5.add(r0)
            int r5 = r3.zzg
            int r5 = r5 + r4
            r3.zzg = r5
        L37:
            int r4 = r3.zzg
            r5 = 2000(0x7d0, float:2.803E-42)
            if (r4 <= r5) goto L6d
            int r4 = r4 + (-2000)
            java.util.ArrayList r5 = r3.zzc
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzzs r5 = (com.google.android.gms.internal.ads.zzzs) r5
            int r1 = r5.zzb
            if (r1 > r4) goto L64
            int r4 = r3.zzg
            int r4 = r4 - r1
            r3.zzg = r4
            java.util.ArrayList r4 = r3.zzc
            r4.remove(r0)
            int r4 = r3.zzh
            r0 = 5
            if (r4 >= r0) goto L37
            com.google.android.gms.internal.ads.zzzs[] r0 = r3.zzd
            int r1 = r4 + 1
            r3.zzh = r1
            r0[r4] = r5
            goto L37
        L64:
            int r1 = r1 - r4
            r5.zzb = r1
            int r5 = r3.zzg
            int r5 = r5 - r4
            r3.zzg = r5
            goto L37
        L6d:
            return
    }

    public final void zzc() {
            r1 = this;
            java.util.ArrayList r0 = r1.zzc
            r0.clear()
            r0 = -1
            r1.zze = r0
            r0 = 0
            r1.zzf = r0
            r1.zzg = r0
            return
    }
}

package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzao extends com.google.android.gms.internal.measurement.zzai {
    protected final java.util.List zza;
    protected final java.util.List zzb;
    protected com.google.android.gms.internal.measurement.zzg zzc;

    private zzao(com.google.android.gms.internal.measurement.zzao r3) {
            r2 = this;
            java.lang.String r0 = r3.zzd
            r2.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r3.zza
            int r1 = r1.size()
            r0.<init>(r1)
            r2.zza = r0
            java.util.List r1 = r3.zza
            r0.addAll(r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r3.zzb
            int r1 = r1.size()
            r0.<init>(r1)
            r2.zzb = r0
            java.util.List r1 = r3.zzb
            r0.addAll(r1)
            com.google.android.gms.internal.measurement.zzg r3 = r3.zzc
            r2.zzc = r3
            return
    }

    public zzao(java.lang.String r1, java.util.List r2, java.util.List r3, com.google.android.gms.internal.measurement.zzg r4) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.zza = r1
            r0.zzc = r4
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L2c
            java.util.Iterator r1 = r2.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.zzap r2 = (com.google.android.gms.internal.measurement.zzap) r2
            java.util.List r4 = r0.zza
            java.lang.String r2 = r2.zzi()
            r4.add(r2)
            goto L16
        L2c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r0.zzb = r1
            return
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg r5, java.util.List r6) {
            r4 = this;
            com.google.android.gms.internal.measurement.zzg r0 = r4.zzc
            com.google.android.gms.internal.measurement.zzg r0 = r0.zza()
            r1 = 0
        L7:
            java.util.List r2 = r4.zza
            int r3 = r2.size()
            if (r1 >= r3) goto L37
            int r3 = r6.size()
            if (r1 >= r3) goto L29
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.get(r1)
            com.google.android.gms.internal.measurement.zzap r3 = (com.google.android.gms.internal.measurement.zzap) r3
            com.google.android.gms.internal.measurement.zzap r3 = r5.zzb(r3)
            r0.zze(r2, r3)
            goto L34
        L29:
            java.lang.Object r2 = r2.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.measurement.zzap r3 = com.google.android.gms.internal.measurement.zzap.zzf
            r0.zze(r2, r3)
        L34:
            int r1 = r1 + 1
            goto L7
        L37:
            java.util.List r5 = r4.zzb
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L60
            java.lang.Object r6 = r5.next()
            com.google.android.gms.internal.measurement.zzap r6 = (com.google.android.gms.internal.measurement.zzap) r6
            com.google.android.gms.internal.measurement.zzap r1 = r0.zzb(r6)
            boolean r2 = r1 instanceof com.google.android.gms.internal.measurement.zzaq
            if (r2 == 0) goto L55
            com.google.android.gms.internal.measurement.zzap r1 = r0.zzb(r6)
        L55:
            boolean r6 = r1 instanceof com.google.android.gms.internal.measurement.zzag
            if (r6 == 0) goto L3d
            com.google.android.gms.internal.measurement.zzag r1 = (com.google.android.gms.internal.measurement.zzag) r1
            com.google.android.gms.internal.measurement.zzap r5 = r1.zzb()
            return r5
        L60:
            com.google.android.gms.internal.measurement.zzap r5 = com.google.android.gms.internal.measurement.zzap.zzf
            return r5
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzap
    public final com.google.android.gms.internal.measurement.zzap zzd() {
            r1 = this;
            com.google.android.gms.internal.measurement.zzao r0 = new com.google.android.gms.internal.measurement.zzao
            r0.<init>(r1)
            return r0
    }
}

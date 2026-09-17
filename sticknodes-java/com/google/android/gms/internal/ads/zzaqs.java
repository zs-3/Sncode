package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaqs implements java.util.Comparator {
    zzaqs() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            byte[] r2 = (byte[]) r2
            int r1 = r1.length
            int r2 = r2.length
            int r1 = r1 - r2
            return r1
    }
}

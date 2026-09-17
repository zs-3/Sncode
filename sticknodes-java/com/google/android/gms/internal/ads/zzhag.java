package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzhag extends java.io.IOException {
    zzhag() {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            r1.<init>(r0)
            return
    }

    zzhag(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r2 = r0.concat(r2)
            r1.<init>(r2, r3)
            return
    }

    zzhag(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            r1.<init>(r0, r2)
            return
    }
}

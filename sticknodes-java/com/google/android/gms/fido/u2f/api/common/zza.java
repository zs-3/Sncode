package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
final class zza implements android.os.Parcelable.Creator {
    zza() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            int r2 = r2.readInt()
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType r2 = com.google.android.gms.fido.u2f.api.common.ChannelIdValue.toChannelIdValueType(r2)     // Catch: com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UnsupportedChannelIdValueTypeException -> L9
            return r2
        L9:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.fido.u2f.api.common.ChannelIdValue$ChannelIdValueType[] r1 = new com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType[r1]
            return r1
    }
}

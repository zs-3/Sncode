package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes.dex */
public abstract class RequestOptions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public RequestOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions();

    public abstract byte[] getChallenge();

    public abstract java.lang.Integer getRequestId();

    public abstract java.lang.Double getTimeoutSeconds();

    public abstract com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding();

    public byte[] serializeToBytes() {
            r1 = this;
            byte[] r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(r1)
            return r0
    }
}

package com.google.android.datatransport.runtime;

@com.google.auto.value.AutoValue
/* loaded from: classes.dex */
abstract class SendRequest {

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.android.datatransport.runtime.SendRequest build();

        abstract com.google.android.datatransport.runtime.SendRequest.Builder setEncoding(com.google.android.datatransport.Encoding r1);

        abstract com.google.android.datatransport.runtime.SendRequest.Builder setEvent(com.google.android.datatransport.Event<?> r1);

        public <T> com.google.android.datatransport.runtime.SendRequest.Builder setEvent(com.google.android.datatransport.Event<T> r1, com.google.android.datatransport.Encoding r2, com.google.android.datatransport.Transformer<T, byte[]> r3) {
                r0 = this;
                r0.setEvent(r1)
                r0.setEncoding(r2)
                r0.setTransformer(r3)
                return r0
        }

        abstract com.google.android.datatransport.runtime.SendRequest.Builder setTransformer(com.google.android.datatransport.Transformer<?, byte[]> r1);

        public abstract com.google.android.datatransport.runtime.SendRequest.Builder setTransportContext(com.google.android.datatransport.runtime.TransportContext r1);

        public abstract com.google.android.datatransport.runtime.SendRequest.Builder setTransportName(java.lang.String r1);
    }

    SendRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.SendRequest.Builder builder() {
            com.google.android.datatransport.runtime.AutoValue_SendRequest$Builder r0 = new com.google.android.datatransport.runtime.AutoValue_SendRequest$Builder
            r0.<init>()
            return r0
    }

    public abstract com.google.android.datatransport.Encoding getEncoding();

    abstract com.google.android.datatransport.Event<?> getEvent();

    public byte[] getPayload() {
            r2 = this;
            com.google.android.datatransport.Transformer r0 = r2.getTransformer()
            com.google.android.datatransport.Event r1 = r2.getEvent()
            java.lang.Object r1 = r1.getPayload()
            java.lang.Object r0 = r0.apply(r1)
            byte[] r0 = (byte[]) r0
            return r0
    }

    abstract com.google.android.datatransport.Transformer<?, byte[]> getTransformer();

    public abstract com.google.android.datatransport.runtime.TransportContext getTransportContext();

    public abstract java.lang.String getTransportName();
}

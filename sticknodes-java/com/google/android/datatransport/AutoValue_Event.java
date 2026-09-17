package com.google.android.datatransport;

/* loaded from: classes.dex */
final class AutoValue_Event<T> extends com.google.android.datatransport.Event<T> {
    private final java.lang.Integer code;
    private final com.google.android.datatransport.EventContext eventContext;
    private final T payload;
    private final com.google.android.datatransport.Priority priority;
    private final com.google.android.datatransport.ProductData productData;

    AutoValue_Event(java.lang.Integer r1, T r2, com.google.android.datatransport.Priority r3, com.google.android.datatransport.ProductData r4, com.google.android.datatransport.EventContext r5) {
            r0 = this;
            r0.<init>()
            r0.code = r1
            java.lang.String r1 = "Null payload"
            java.util.Objects.requireNonNull(r2, r1)
            r0.payload = r2
            java.lang.String r1 = "Null priority"
            java.util.Objects.requireNonNull(r3, r1)
            r0.priority = r3
            r0.productData = r4
            r0.eventContext = r5
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.datatransport.Event
            r2 = 0
            if (r1 == 0) goto L65
            com.google.android.datatransport.Event r5 = (com.google.android.datatransport.Event) r5
            java.lang.Integer r1 = r4.code
            if (r1 != 0) goto L16
            java.lang.Integer r1 = r5.getCode()
            if (r1 != 0) goto L63
            goto L20
        L16:
            java.lang.Integer r3 = r5.getCode()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
        L20:
            T r1 = r4.payload
            java.lang.Object r3 = r5.getPayload()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
            com.google.android.datatransport.Priority r1 = r4.priority
            com.google.android.datatransport.Priority r3 = r5.getPriority()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
            com.google.android.datatransport.ProductData r1 = r4.productData
            if (r1 != 0) goto L43
            com.google.android.datatransport.ProductData r1 = r5.getProductData()
            if (r1 != 0) goto L63
            goto L4d
        L43:
            com.google.android.datatransport.ProductData r3 = r5.getProductData()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L63
        L4d:
            com.google.android.datatransport.EventContext r1 = r4.eventContext
            if (r1 != 0) goto L58
            com.google.android.datatransport.EventContext r5 = r5.getEventContext()
            if (r5 != 0) goto L63
            goto L64
        L58:
            com.google.android.datatransport.EventContext r5 = r5.getEventContext()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L63
            goto L64
        L63:
            r0 = 0
        L64:
            return r0
        L65:
            return r2
    }

    @Override // com.google.android.datatransport.Event
    public java.lang.Integer getCode() {
            r1 = this;
            java.lang.Integer r0 = r1.code
            return r0
    }

    @Override // com.google.android.datatransport.Event
    public com.google.android.datatransport.EventContext getEventContext() {
            r1 = this;
            com.google.android.datatransport.EventContext r0 = r1.eventContext
            return r0
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
            r1 = this;
            T r0 = r1.payload
            return r0
    }

    @Override // com.google.android.datatransport.Event
    public com.google.android.datatransport.Priority getPriority() {
            r1 = this;
            com.google.android.datatransport.Priority r0 = r1.priority
            return r0
    }

    @Override // com.google.android.datatransport.Event
    public com.google.android.datatransport.ProductData getProductData() {
            r1 = this;
            com.google.android.datatransport.ProductData r0 = r1.productData
            return r0
    }

    public int hashCode() {
            r4 = this;
            java.lang.Integer r0 = r4.code
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r2
            int r0 = r0 * r2
            T r3 = r4.payload
            int r3 = r3.hashCode()
            r0 = r0 ^ r3
            int r0 = r0 * r2
            com.google.android.datatransport.Priority r3 = r4.priority
            int r3 = r3.hashCode()
            r0 = r0 ^ r3
            int r0 = r0 * r2
            com.google.android.datatransport.ProductData r3 = r4.productData
            if (r3 != 0) goto L29
            r3 = 0
            goto L2d
        L29:
            int r3 = r3.hashCode()
        L2d:
            r0 = r0 ^ r3
            int r0 = r0 * r2
            com.google.android.datatransport.EventContext r2 = r4.eventContext
            if (r2 != 0) goto L35
            goto L39
        L35:
            int r1 = r2.hashCode()
        L39:
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Event{code="
            r0.append(r1)
            java.lang.Integer r1 = r2.code
            r0.append(r1)
            java.lang.String r1 = ", payload="
            r0.append(r1)
            T r1 = r2.payload
            r0.append(r1)
            java.lang.String r1 = ", priority="
            r0.append(r1)
            com.google.android.datatransport.Priority r1 = r2.priority
            r0.append(r1)
            java.lang.String r1 = ", productData="
            r0.append(r1)
            com.google.android.datatransport.ProductData r1 = r2.productData
            r0.append(r1)
            java.lang.String r1 = ", eventContext="
            r0.append(r1)
            com.google.android.datatransport.EventContext r1 = r2.eventContext
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package org.apache.commons.lang3.event;

/* loaded from: classes2.dex */
public class EventListenerSupport<L> implements java.io.Serializable {
    private static final long serialVersionUID = 3593265990380473632L;
    private java.util.List<L> listeners;
    private transient L[] prototypeArray;
    private transient L proxy;

    protected class ProxyInvocationHandler implements java.lang.reflect.InvocationHandler {
        final /* synthetic */ org.apache.commons.lang3.event.EventListenerSupport this$0;

        protected ProxyInvocationHandler(org.apache.commons.lang3.event.EventListenerSupport r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object[] r4) throws java.lang.Throwable {
                r1 = this;
                org.apache.commons.lang3.event.EventListenerSupport r2 = r1.this$0
                java.util.List r2 = org.apache.commons.lang3.event.EventListenerSupport.access$000(r2)
                java.util.Iterator r2 = r2.iterator()
            La:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L18
                java.lang.Object r0 = r2.next()
                r3.invoke(r0, r4)
                goto La
            L18:
                r2 = 0
                return r2
        }
    }

    private EventListenerSupport() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.listeners = r0
            return
    }

    public EventListenerSupport(java.lang.Class<L> r2) {
            r1 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1.<init>(r2, r0)
            return
    }

    public EventListenerSupport(java.lang.Class<L> r5, java.lang.ClassLoader r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "Listener interface cannot be null."
            org.apache.commons.lang3.Validate.notNull(r5, r2, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "ClassLoader cannot be null."
            org.apache.commons.lang3.Validate.notNull(r6, r2, r1)
            boolean r1 = r5.isInterface()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r5.getName()
            r2[r0] = r3
            java.lang.String r0 = "Class {0} is not an interface"
            org.apache.commons.lang3.Validate.isTrue(r1, r0, r2)
            r4.initializeTransientFields(r5, r6)
            return
    }

    static /* synthetic */ java.util.List access$000(org.apache.commons.lang3.event.EventListenerSupport r0) {
            java.util.List<L> r0 = r0.listeners
            return r0
    }

    public static <T> org.apache.commons.lang3.event.EventListenerSupport<T> create(java.lang.Class<T> r1) {
            org.apache.commons.lang3.event.EventListenerSupport r0 = new org.apache.commons.lang3.event.EventListenerSupport
            r0.<init>(r1)
            return r0
    }

    private void createProxy(java.lang.Class<L> r3, java.lang.ClassLoader r4) {
            r2 = this;
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.reflect.InvocationHandler r1 = r2.createInvocationHandler()
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r4, r0, r1)
            java.lang.Object r3 = r3.cast(r4)
            r2.proxy = r3
            return
    }

    private void initializeTransientFields(java.lang.Class<L> r2, java.lang.ClassLoader r3) {
            r1 = this;
            r0 = 0
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1.prototypeArray = r0
            r1.createProxy(r2, r3)
            return
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.Object r2 = r2.readObject()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r2)
            r1.listeners = r0
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r2 = r2.getComponentType()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1.initializeTransientFields(r2, r0)
            return
    }

    private void writeObject(java.io.ObjectOutputStream r5) throws java.io.IOException {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r1.<init>(r2)
            java.util.List<L> r2 = r4.listeners
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            r1.writeObject(r3)     // Catch: java.io.IOException -> L26
            r0.add(r3)     // Catch: java.io.IOException -> L26
            goto L15
        L26:
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            r1.<init>(r3)
            goto L15
        L31:
            L[] r1 = r4.prototypeArray
            java.lang.Object[] r0 = r0.toArray(r1)
            r5.writeObject(r0)
            return
    }

    public void addListener(L r2) {
            r1 = this;
            r0 = 1
            r1.addListener(r2, r0)
            return
    }

    public void addListener(L r3, boolean r4) {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Listener object cannot be null."
            org.apache.commons.lang3.Validate.notNull(r3, r1, r0)
            if (r4 == 0) goto L10
            java.util.List<L> r4 = r2.listeners
            r4.add(r3)
            goto L1d
        L10:
            java.util.List<L> r4 = r2.listeners
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L1d
            java.util.List<L> r4 = r2.listeners
            r4.add(r3)
        L1d:
            return
    }

    protected java.lang.reflect.InvocationHandler createInvocationHandler() {
            r1 = this;
            org.apache.commons.lang3.event.EventListenerSupport$ProxyInvocationHandler r0 = new org.apache.commons.lang3.event.EventListenerSupport$ProxyInvocationHandler
            r0.<init>(r1)
            return r0
    }

    public L fire() {
            r1 = this;
            L r0 = r1.proxy
            return r0
    }

    int getListenerCount() {
            r1 = this;
            java.util.List<L> r0 = r1.listeners
            int r0 = r0.size()
            return r0
    }

    public L[] getListeners() {
            r2 = this;
            java.util.List<L> r0 = r2.listeners
            L[] r1 = r2.prototypeArray
            java.lang.Object[] r0 = r0.toArray(r1)
            return r0
    }

    public void removeListener(L r3) {
            r2 = this;
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Listener object cannot be null."
            org.apache.commons.lang3.Validate.notNull(r3, r1, r0)
            java.util.List<L> r0 = r2.listeners
            r0.remove(r3)
            return
    }
}

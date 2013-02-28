/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#modifyEventSubscription(ModifyEventSubscriptionRequest) ModifyEventSubscription operation}.
 * <p>
 * Modifies an existing RDS event notification subscription. Note that you cannot modify the source identifiers using this call; to change source
 * identifiers for a subscription, use the AddSourceIdentifierToSubscription and RemoveSourceIdentifierFromSubscription calls.
 * </p>
 * <p>
 * You can see a list of the event categories for a given SourceType in the <a
 * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html"> Events </a> topic in the Amazon RDS User Guide or by using the
 * <b>DescribeEventCategories</b> action.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#modifyEventSubscription(ModifyEventSubscriptionRequest)
 */
public class ModifyEventSubscriptionRequest extends AmazonWebServiceRequest {

    /**
     * The name of the RDS event notification subscription.
     */
    private String subscriptionName;

    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. The ARN is created by Amazon SNS when you create a topic
     * and subscribe to it.
     */
    private String snsTopicArn;

    /**
     * The type of source that will be generating the events. For example, if
     * you want to be notified of events generated by a DB instance, you
     * would set this parameter to db-instance. if this value is not
     * specified, all events are returned. <p>Valid values: db-instance |
     * db-parameter-group | db-security-group | db-snapshot
     */
    private String sourceType;

    /**
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the
     * <a
     * aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a>
     * topic in the Amazon RDS User Guide or by using the
     * <b>DescribeEventCategories</b> action.
     */
    private java.util.List<String> eventCategories;

    /**
     * A Boolean value; set to <b>true</b> to activate the subscription.
     */
    private Boolean enabled;

    /**
     * The name of the RDS event notification subscription.
     *
     * @return The name of the RDS event notification subscription.
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }
    
    /**
     * The name of the RDS event notification subscription.
     *
     * @param subscriptionName The name of the RDS event notification subscription.
     */
    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
    
    /**
     * The name of the RDS event notification subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionName The name of the RDS event notification subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyEventSubscriptionRequest withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }
    
    
    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. The ARN is created by Amazon SNS when you create a topic
     * and subscribe to it.
     *
     * @return The Amazon Resource Name (ARN) of the SNS topic created for event
     *         notification. The ARN is created by Amazon SNS when you create a topic
     *         and subscribe to it.
     */
    public String getSnsTopicArn() {
        return snsTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. The ARN is created by Amazon SNS when you create a topic
     * and subscribe to it.
     *
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     *         notification. The ARN is created by Amazon SNS when you create a topic
     *         and subscribe to it.
     */
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the SNS topic created for event
     * notification. The ARN is created by Amazon SNS when you create a topic
     * and subscribe to it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic created for event
     *         notification. The ARN is created by Amazon SNS when you create a topic
     *         and subscribe to it.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyEventSubscriptionRequest withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }
    
    
    /**
     * The type of source that will be generating the events. For example, if
     * you want to be notified of events generated by a DB instance, you
     * would set this parameter to db-instance. if this value is not
     * specified, all events are returned. <p>Valid values: db-instance |
     * db-parameter-group | db-security-group | db-snapshot
     *
     * @return The type of source that will be generating the events. For example, if
     *         you want to be notified of events generated by a DB instance, you
     *         would set this parameter to db-instance. if this value is not
     *         specified, all events are returned. <p>Valid values: db-instance |
     *         db-parameter-group | db-security-group | db-snapshot
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * The type of source that will be generating the events. For example, if
     * you want to be notified of events generated by a DB instance, you
     * would set this parameter to db-instance. if this value is not
     * specified, all events are returned. <p>Valid values: db-instance |
     * db-parameter-group | db-security-group | db-snapshot
     *
     * @param sourceType The type of source that will be generating the events. For example, if
     *         you want to be notified of events generated by a DB instance, you
     *         would set this parameter to db-instance. if this value is not
     *         specified, all events are returned. <p>Valid values: db-instance |
     *         db-parameter-group | db-security-group | db-snapshot
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * The type of source that will be generating the events. For example, if
     * you want to be notified of events generated by a DB instance, you
     * would set this parameter to db-instance. if this value is not
     * specified, all events are returned. <p>Valid values: db-instance |
     * db-parameter-group | db-security-group | db-snapshot
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceType The type of source that will be generating the events. For example, if
     *         you want to be notified of events generated by a DB instance, you
     *         would set this parameter to db-instance. if this value is not
     *         specified, all events are returned. <p>Valid values: db-instance |
     *         db-parameter-group | db-security-group | db-snapshot
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyEventSubscriptionRequest withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    
    /**
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the
     * <a
     * aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a>
     * topic in the Amazon RDS User Guide or by using the
     * <b>DescribeEventCategories</b> action.
     *
     * @return A list of event categories for a SourceType that you want to subscribe
     *         to. You can see a list of the categories for a given SourceType in the
     *         <a
     *         aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a>
     *         topic in the Amazon RDS User Guide or by using the
     *         <b>DescribeEventCategories</b> action.
     */
    public java.util.List<String> getEventCategories() {
        
        if (eventCategories == null) {
            eventCategories = new java.util.ArrayList<String>();
        }
        return eventCategories;
    }
    
    /**
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the
     * <a
     * aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a>
     * topic in the Amazon RDS User Guide or by using the
     * <b>DescribeEventCategories</b> action.
     *
     * @param eventCategories A list of event categories for a SourceType that you want to subscribe
     *         to. You can see a list of the categories for a given SourceType in the
     *         <a
     *         aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a>
     *         topic in the Amazon RDS User Guide or by using the
     *         <b>DescribeEventCategories</b> action.
     */
    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        java.util.List<String> eventCategoriesCopy = new java.util.ArrayList<String>(eventCategories.size());
        eventCategoriesCopy.addAll(eventCategories);
        this.eventCategories = eventCategoriesCopy;
    }
    
    /**
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the
     * <a
     * aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a>
     * topic in the Amazon RDS User Guide or by using the
     * <b>DescribeEventCategories</b> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories A list of event categories for a SourceType that you want to subscribe
     *         to. You can see a list of the categories for a given SourceType in the
     *         <a
     *         aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a>
     *         topic in the Amazon RDS User Guide or by using the
     *         <b>DescribeEventCategories</b> action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyEventSubscriptionRequest withEventCategories(String... eventCategories) {
        if (getEventCategories() == null) setEventCategories(new java.util.ArrayList<String>(eventCategories.length));
        for (String value : eventCategories) {
            getEventCategories().add(value);
        }
        return this;
    }
    
    /**
     * A list of event categories for a SourceType that you want to subscribe
     * to. You can see a list of the categories for a given SourceType in the
     * <a
     * aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a>
     * topic in the Amazon RDS User Guide or by using the
     * <b>DescribeEventCategories</b> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventCategories A list of event categories for a SourceType that you want to subscribe
     *         to. You can see a list of the categories for a given SourceType in the
     *         <a
     *         aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Events.html">Events</a>
     *         topic in the Amazon RDS User Guide or by using the
     *         <b>DescribeEventCategories</b> action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyEventSubscriptionRequest withEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
        } else {
            java.util.List<String> eventCategoriesCopy = new java.util.ArrayList<String>(eventCategories.size());
            eventCategoriesCopy.addAll(eventCategories);
            this.eventCategories = eventCategoriesCopy;
        }

        return this;
    }
    
    /**
     * A Boolean value; set to <b>true</b> to activate the subscription.
     *
     * @return A Boolean value; set to <b>true</b> to activate the subscription.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * A Boolean value; set to <b>true</b> to activate the subscription.
     *
     * @param enabled A Boolean value; set to <b>true</b> to activate the subscription.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * A Boolean value; set to <b>true</b> to activate the subscription.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled A Boolean value; set to <b>true</b> to activate the subscription.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ModifyEventSubscriptionRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    
    
    /**
     * A Boolean value; set to <b>true</b> to activate the subscription.
     *
     * @return A Boolean value; set to <b>true</b> to activate the subscription.
     */
    public Boolean getEnabled() {
        return enabled;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSubscriptionName() != null) sb.append("SubscriptionName: " + getSubscriptionName() + ", ");
        if (getSnsTopicArn() != null) sb.append("SnsTopicArn: " + getSnsTopicArn() + ", ");
        if (getSourceType() != null) sb.append("SourceType: " + getSourceType() + ", ");
        if (getEventCategories() != null) sb.append("EventCategories: " + getEventCategories() + ", ");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode()); 
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode()); 
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode()); 
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ModifyEventSubscriptionRequest == false) return false;
        ModifyEventSubscriptionRequest other = (ModifyEventSubscriptionRequest)obj;
        
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null) return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false) return false; 
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null) return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false) return false; 
        if (other.getSourceType() == null ^ this.getSourceType() == null) return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false) return false; 
        if (other.getEventCategories() == null ^ this.getEventCategories() == null) return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        return true;
    }
    
}
    
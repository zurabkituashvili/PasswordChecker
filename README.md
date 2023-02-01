<div _ngcontent-msn-c210="" id="programming-exercise-instructions-content" class="guided-tour instructions__content__markdown markdown-preview"><h3 id="checkingpasswords">Checking Passwords</h3>
<p>In this assignment we would like to realize a variety of exceptions that are useful for checking passwords.
Thereby, we are going to implement the following class hierarchy where
<a rel="noopener noreferrer" href="https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html">Exception</a>
from the Java standard library is used as the root class.</p>
<p><img alt="exceptions.png" src="/api/files/markdown/Markdown_2022-11-28T16-34-59-016_4d730fb0.png"></p>
<p>For a password, the following minimal requirements may be enforced which, when absent, result in throwing
an appropriate exception:</p>
<ul>
<li>The password should have a minimal length, otherwise <code>NotLongEnoughException</code> is thrown.</li>
<li>The password should contain a minimal number of upper case letters, otherwise the exception
<code>NotEnoughUpperCase</code> is thrown.</li>
<li>The password should contain a minimal number of lower case letters, otherwise the exception
<code>NotEnoughLowerCase</code> is thrown.</li>
<li>The password should contain a minimal number of special characters, otherwise the exception
<code>NotEnoughspecial</code> is thrown.</li>
<li>The password should contain a minimal number of digits, otherwise the exception
<code>NotEnoughNumber</code> is thrown.</li>
<li>The password must not contain specific special characters, otherwise the exception
<code>IllegalCharException</code> is thrown.</li>
</ul>
<p>Wir betrachten hier alle Zeichen zwischen
Here, we consider all characters between <code>'a'</code> and <code>'z'</code> as lower case, all characters between <code>'A'</code>
and <code>'Z'</code> as upper case, all characters between <code>'0'</code> and <code>'9'</code> as digits and everything else as special.</p>
<p>For the concrete implementation the following requirements should hold:</p>
<ul>
<li>The class <code>NotEnoughException</code> has the two attributes <code>should</code> and <code>is</code>.
These represent the minimal number of characters of a given category which should be present in a password, and the
strictly smaller number in the passward for which the exception is thrown.
These attributes should be set by the constructor
<code>public NotEnoughException(int should, int is)</code>.</li>
</ul>
<p>If <code>is</code> is not strictly less than <code>should</code>, an [IllegalArgumentException](<a rel="noopener noreferrer" href="https://docs.oracle.com/javase/7/docs/api/java/lang/">https://docs.oracle.com/javase/7/docs/api/java/lang/</a>     IllegalArgumentException.html) should be thrown.</p>
<ul>
<li>Each subclass of <code>NotEnoughException</code> accepts in its constructor the same parameters which initialize the attributes of the
superclass accordingly.</li>
<li>Each class should provide its own <code>toString</code> method and thereby return an error message which provides all relevant information
(in particular, the known attribute values).
For the class
<code>IllegalCharException</code> use the provided method <code>escapeSpecial</code>.</li>
</ul>
<p>Finally, implement a method <code>checkFormat(String pwd)</code> in <code>Password</code> which checks the passed argument for the
for the criteria fixed in the constructor and, possibly, throws the appropriate exception.</p>
<p>Avoid code duplicates as much as possible by using the keyword <code>super</code>.
All pre-existing member variables must be declared as <code>final</code>.</p></div>

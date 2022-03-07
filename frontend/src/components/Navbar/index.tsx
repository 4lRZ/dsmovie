import { ReactComponent as GithubIcon } from 'assets/img/github.svg'
import './styles.css';

function Navbar() {
    return (
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/4lRZ">
                        <div className="dsmovice-contact-container">
                            <GithubIcon />
                            <p className="dsmovie-contact-link">/4lRZ</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>);
}

export default Navbar